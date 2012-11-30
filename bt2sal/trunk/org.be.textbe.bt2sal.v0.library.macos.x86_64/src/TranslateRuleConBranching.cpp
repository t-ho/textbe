// File name: TranslateRuleConBranching.cpp
// Author/s : Nisansala Yatapanage
// Date built: 14/7/06
// Last updated: 19/6/07
// Purpose: Implementation of the Parallel Branching Rule (Rule 3).
//
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateRuleConBranching.h"
#include "TranslateStep.h"
#include "TranslateException.h"
#include "GSEMethod.h"



CTranslateRuleConBranching::CTranslateRuleConBranching(void)
{
	m_iRuleID = 3;
}

CTranslateRuleConBranching::~CTranslateRuleConBranching(void)
{
}

bool CTranslateRuleConBranching::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	if (bConsiderIfBranching == false){
		NList<int, int> lMatchedNodes;
		NList<int, int> lFinishedNodes;
		bool bRuleMatched = false;
		NPosition cCurrentNodePosition;
		cCurrentNodePosition = cLeafNodes.GetHeadPosition();

		while(cCurrentNodePosition.IsNotNull()){		
			int iCurrentNode;
			iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
			CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
			// Check whether this node was already finished by its sibling.
			NPosition cFinishedPosition = lFinishedNodes.Find(iCurrentNode);
			if (cFinishedPosition.IsNull()){
				int iStateType = pcNode->GetType();
				int iSiblingNumber = pcNode->GetSiblingNumber();
				// Check if this node has at least one sibling.
				if ((iCurrentNode != iFinalNode) && (iSiblingNumber > 0)){   
						// Check if all the siblings are leaf nodes and are alternative nodes.
					bool bAllConcurrent = true;
					bool bAllSiblingsLeaves = true;
					int iParent = pcNode->GetParent();
					CTranslateNode* pcParent = cMain.GetNode(iParent);
					for (int i = 0; i < (iSiblingNumber + 1); i++){
						int iSibling = pcParent->GetChildID(i);
						CTranslateNode* pcSibling = cMain.GetNode(iSibling);
						bool bIsAlternative = pcSibling->IsNodeNonDeterministic();
						if (bIsAlternative == true){
							// It's alternative.
							bAllConcurrent = false;
						}
						NPosition cSiblingLocation = cLeafNodes.Find(iSibling);
						if (cSiblingLocation.IsNull()){
							// The sibling is not a leaf node.
							bAllSiblingsLeaves = false;
						}
					}

					if ((bAllSiblingsLeaves == true) && (bAllConcurrent == true)){  
						// Parse the branching nodes individually.
						NList<int, int>* plMatchedRules = new NList<int, int>;
						for (int i = 0; i < (iSiblingNumber + 1); i++){
							int iSibling = pcParent->GetChildID(i);

							// Find a matching rule for this sibling node.
							NList<int, int> lNode;
							lNode.AddHead(iSibling);
							NPosition cRulePosition;
							cRulePosition = plRules->GetHeadPosition();
							bool bNodeParsed = false;
							bool bSuccess;
							int iRuleCounter;
							while(cRulePosition.IsNotNull()){
								CTranslateParsingRule* pcCurrentRule;
								pcCurrentRule = plRules->GetNext(cRulePosition);
								bSuccess = pcCurrentRule->applyBackwards(cMain,lNode,cAllNodes,iFinalNode,cInitNodes,true,plRules);
								if (bSuccess == true){
									bNodeParsed = true;
									iRuleCounter = pcCurrentRule->getID();
									plMatchedRules->AddTail(iRuleCounter);
								}
							}
							if (bNodeParsed == false){
								// The node could not be parsed.
								NString strParseError = "No matching rules found for node: ";
								CTranslateNode* pcSibling = cMain.GetNode(iSibling);
								NString strComponentName = pcSibling->GetComponentName();
								NString strStateName = pcSibling->GetStateName();
								strParseError = strParseError + strComponentName + " ";
								strParseError = strParseError + strStateName;
								CTranslateException cException(strParseError);
								throw cException;
							}
						}
						cMain.StoreTranslationStep(iCurrentNode, 3, NULL, plMatchedRules);
						bRuleMatched = true;
					
						// Record that the siblings have been done too.
						for (int i = 0; i < (iSiblingNumber + 1); i++){
							int iSibling = pcParent->GetChildID(i);
							lFinishedNodes.AddTail(iSibling);
							lMatchedNodes.AddTail(iSibling);
						}
					}
				}
			}
		}

		// Remove the matched nodes from the leaf nodes list and add their parents.
		NPosition cMatchedPosition;
		cMatchedPosition = lMatchedNodes.GetHeadPosition();
		while(cMatchedPosition.IsNotNull()){
			int iMatchedNode;
			iMatchedNode = lMatchedNodes.GetNext(cMatchedPosition);	
			CTranslateNode* pcMatchedNode = cMain.GetNode(iMatchedNode);
			NPosition cNodePosition = cLeafNodes.Find(iMatchedNode);
			cLeafNodes.RemoveAt(cNodePosition);
			if (bConsiderIfBranching == false){ // Don't add the parent otherwise.
				int iParentNode = pcMatchedNode->GetParent();
				if (iParentNode != iFinalNode){  // This isn't the final node.
					cNodePosition = cLeafNodes.Find(iParentNode);
					if (cNodePosition.IsNull()){ // The parent wasn't already added.
						cLeafNodes.AddTail(iParentNode);
					}
				}
			}
		}
		return bRuleMatched;
	}else{
		return false;
	}
}

void CTranslateRuleConBranching::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	// For each of the siblings.
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	int iSiblingNum = pcNode->GetSiblingNumber();
	int iParent = pcNode->GetParent();
	CTranslateNode* pcParent = cMain.GetNode(iParent);
	for (int i = 0; i < (iSiblingNum + 1); i++){
		int iCurrent = pcParent->GetChildID(i);
		CTranslateParsingRule* pcSecondaryRule;
		pcSecondaryRule = FindRule(i, plSecondaryRules);
		pcSecondaryRule->translateToSAL(cMain,iCurrent,NULL,NULL);

		// Add to the parent.
		NString strProgramCounterName = cMain.GetPCForNode(iCurrent);
		NString strParentAction = strProgramCounterName + "'=1";
		cMain.AddExtraNodeAction(iParent, strParentAction);
	}
}

CTranslateParsingRule* CTranslateRuleConBranching::FindRule(int iIndex, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
	NPosition cPosition = plSecondaryRules->GetHeadPosition();
	int iCounter = 0;
	CTranslateParsingRule* pcRule;
	while(cPosition.IsNotNull()){
		pcRule = plSecondaryRules->GetNext(cPosition);
		if (iCounter == iIndex){
			return pcRule;
		}
		iCounter++;
	}
	return NULL;
}

/*void CTranslateRuleConBranching::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{ // This has been commented only because NList currently can't do getPrev and getTailPosition.
	// For each of the siblings.
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	int iSiblingNum = pcNode->GetSiblingNumber();
	int iParent = pcNode->GetParent();
	CTranslateNode* pcParent = cMain.GetNode(iParent);
	NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions = new NList<CTranslateUTrans*, CTranslateUTrans*>;
	CTranslateUTrans* pcCurrentTransition;
	NString strLabel;
	int iCurrentPC;
	int iLabelType;

	for (int i = 0; i < (iSiblingNum + 1); i++){
		int iCurrent = pcParent->GetChildID(i);
		iCurrentPC = cMain.GetPC(iCurrent);

		// Associate this branch's pc with a process with the same number.
		cMain.SetProcess(iCurrentPC, iCurrentPC);
		cMain.SetPCLocation(iCurrentPC, 0);

		CTranslateParsingRule* pcSecondaryRule;
		pcSecondaryRule = FindRule(i, plSecondaryRules);
		pcSecondaryRule->translateToUPPAAL(cMain,iCurrent,NULL,NULL);

		// Add a transition to the parent to start this thread.
		strLabel = "startpro";
		strLabel.Format(strLabel + "%d"), iCurrentPC;
		strLabel.Append("!");
		pcCurrentTransition = new CTranslateUTrans();
		iLabelType = UPPAAL_SYNCH;
		pcCurrentTransition->AddLabel(strLabel, iLabelType);	
		plTransitions->AddTail(pcCurrentTransition);
	}

	// Add the parent's transition/s to the list of transitions.
	pcCurrentTransition = cMain.GetNodeTransition(iParent);
	if (pcCurrentTransition.IsNotNull()){  // The parent had only one transition.
		plTransitions->AddHead(pcCurrentTransition);
	}else{  // The parent already had multiple transitions.
		NList<CTranslateUTrans*, CTranslateUTrans*>* plEarlierTransitions;
		plEarlierTransitions = cMain.GetMultipleTransitions(iParent);
		NPosition cEarlierPos = plEarlierTransitions->GetTailPosition();
		while (cEarlierPos.IsNotNull()){
			pcCurrentTransition = plEarlierTransitions->GetPrev(cEarlierPos);
			plTransitions->AddHead(pcCurrentTransition);
		}
	}

	// Add a transition to reset the parent process to disabled,
	// but only if the parent is not the root node or part of the root block.
	CTranslateUTrans* pcResetTransition;
	int iProcess; // Don't worry, it gets set to a value if iParent is not the start node,
	// otherwise iProcess is not needed anyway.
	if (iParent != cMain.m_iStartNode){
		pcResetTransition = new CTranslateUTrans();
		int iPC = cMain.GetPC(iParent);
		iProcess = cMain.GetProcess(iPC);
		pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
		pcResetTransition->SetIsJumpNode(true);
		plTransitions->AddTail(pcResetTransition);
	
		m_cParsingMethods.StoreMultipleUPPAALTransition(cMain, iParent, plTransitions, false);

		// Set the target node of the reset transition again as it would have been changed.
		pcResetTransition->SetTarget(iProcess, 0, 0); // The disabled state.
	}else{
		NPosition cDeletePos = plTransitions->GetHeadPosition();
		while (cDeletePos.IsNotNull()){
			CTranslateUTrans* pcTrans = plTransitions->GetNext(cDeletePos);
			delete pcTrans;
		}
		plTransitions->RemoveAll();
		delete plTransitions;
	}
}*/