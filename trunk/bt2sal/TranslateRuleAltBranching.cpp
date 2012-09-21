// File name: TranslateRuleAltBranching.cpp
// Author/s : Nisansala Yatapanage
// Date built: 21/7/2006
// Last updated: 19/6/2007
// Purpose: Implementation of Alternative branching rule (Rule 4).
//
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateRuleAltBranching.h"
#include "TranslateStep.h"
#include "TranslateException.h"
#include "GSEMethod.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif
CTranslateRuleAltBranching::CTranslateRuleAltBranching(void)
{
	m_iRuleID = 4;
}

CTranslateRuleAltBranching::~CTranslateRuleAltBranching(void)
{
}

bool CTranslateRuleAltBranching::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
			// Check whether this node was already finished by its sibling.
			NPosition cFinishedPosition = lFinishedNodes.Find(iCurrentNode);
			if (cFinishedPosition == NULL){
				CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
				int iStateType = pcNode->GetType();
				int iSiblingNumber = pcNode->GetSiblingNumber();
				// Check if this node has at least one sibling.
				if ((iCurrentNode != iFinalNode) && (iSiblingNumber > 0)){   
					// Check if all the siblings are leaf nodes and are alternative nodes.
					bool bAllAlternative = true;
					bool bAllSiblingsLeaves = true;
					int iParent = pcNode->GetParent();
					CTranslateNode* pcParent = cMain.GetNode(iParent);
					for (int i = 0; i < (iSiblingNumber + 1); i++){	
						int iSibling = pcParent->GetChildID(i);
						CTranslateNode* pcSibling = cMain.GetNode(iSibling);
						bool bIsAlternative = pcSibling->IsNodeNonDeterministic();
						if (bIsAlternative == false){
							// It's concurrent.
							bAllAlternative = false;
						}
						NPosition cSiblingLocation = cLeafNodes.Find(iSibling);
						if (cSiblingLocation == NULL){
							// The sibling is not a leaf node.
							bAllSiblingsLeaves = false;
						}
					}

					if ((bAllSiblingsLeaves == true) && (bAllAlternative == true)){  
						// Check whether there are either no selection nodes or they are all selections.
						bool bFoundSelection = false;
						bool bFoundNonSelection = false;
						for (int i = 0; i < (iSiblingNumber + 1); i++){	
							int iSibling = pcParent->GetChildID(i);
							CTranslateNode* pcSibling = cMain.GetNode(iSibling);
							int iSiblingType = pcSibling->GetType();
							if (iSiblingType == GSE_T_CONDITION){
								bFoundSelection = true;
							}else{
								bFoundNonSelection = true;
							}
						}
						if ((bFoundSelection == true) && (bFoundNonSelection == true)){
							// This is invalid.
							CString strParseError = _T("Mixed selections and non-selections are not allowed in alternate branching:\r\n");
							for (int i = 0; i < (iSiblingNumber + 1); i++){	
								int iSibling = pcParent->GetChildID(i);
								CTranslateNode* pcSibling = cMain.GetNode(iSibling);
								CString strComponentName = pcSibling->GetComponentName();
								CString strStateName = pcSibling->GetStateName();
								strParseError.Append(strComponentName + _T(" "));
								strParseError.Append(strStateName);
								strParseError.Append(_T("\r\n"));
							}
							CTranslateException cException(strParseError);
							throw cException;
						}

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
								CString strParseError = _T("No matching rules found for node: ");
								CTranslateNode* pcSibling = cMain.GetNode(iSibling);
								CString strComponentName = pcSibling->GetComponentName();
								CString strStateName = pcSibling->GetStateName();
								strParseError = strParseError + strComponentName + _T(" ");
								strParseError = strParseError + strStateName;
								CTranslateException cException(strParseError);
								throw cException;
							}
						}
						cMain.StoreTranslationStep(iCurrentNode, 4, NULL, plMatchedRules);
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
					if (cNodePosition == NULL){ // The parent wasn't already added.
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

void CTranslateRuleAltBranching::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	// For each of the siblings.
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	int iSiblingNum = pcNode->GetSiblingNumber();
	int iParent = pcNode->GetParent();
	CTranslateNode* pcParent = cMain.GetNode(iParent);
	for (int i = 0; i < (iSiblingNum + 1); i++){
		int iCurrent = pcParent->GetChildID(i);

		if (cMain.IsAtomic(iCurrent)){  // This is an atomic node.
			// Add this program counter to each atomic block associated with this node.
			NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
			pcBlocks = cMain.GetAtomicBlocks(iCurrent);

			int iPC = cMain.GetPC(iCurrent);
			NPosition cBlockPos = pcBlocks->GetHeadPosition();
			CTranslateAtomicBlock* pcCurrentBlock;
			while (cBlockPos.IsNotNull()){
				pcCurrentBlock = pcBlocks->GetNext(cBlockPos);
				pcCurrentBlock->AddNewProgramCounter(iPC);
			}

			// Include the guard of the pc = 1.
			CString strGuard;
			CString strProgramCounterName = cMain.GetPCForNode(iCurrent);
			strGuard = strProgramCounterName + _T("=1");
			cMain.AddAtomicGuard(iCurrent, strGuard);
		}

		CTranslateParsingRule* pcSecondaryRule;
		pcSecondaryRule = FindRule(i, plSecondaryRules);
		pcSecondaryRule->translateToSAL(cMain,iCurrent,NULL,NULL);

		// Create actions to set all the sibling nodes' PC's to 0.
		for (int j = 0; j < (iSiblingNum + 1); j++){
			if (i != j){    // This is not the same current node.
				int iSibling = pcParent->GetChildID(j);
				CString zeroPC = cMain.GetPCForNode(iSibling);
				cMain.AddExtraNodeAction(iCurrent, zeroPC + _T("'=0"));
			}
		}

		// Add to the parent if this is a normal node.
		if (!cMain.IsAtomic(iCurrent)){  // The node is not atomic.
 			CString strProgramCounterName = cMain.GetPCForNode(iCurrent);
			CString strParentAction = strProgramCounterName + _T("'=1");
			cMain.AddExtraNodeAction(iParent, strParentAction);
		}else{	// The node is atomic.
		// Add to the parent of this whole atomic path if this is an atomic node.
			// Just get the first atomic block, because all the atomic blocks
			// that this node is associated with will have the same parent.
			NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcBlocks;
			pcBlocks = cMain.GetAtomicBlocks(iCurrent);
			CTranslateAtomicBlock* pcFirstBlock = pcBlocks->GetHead();
			int iTopOfBlock = pcFirstBlock->GetTopNode();
			CTranslateNode* pcTopOfBlock = cMain.GetNode(iTopOfBlock);
			int iParentOfBlock = pcTopOfBlock->GetParent();
			// Check whether the parent is the start node.
			if (cMain.m_iStartNode == iParentOfBlock){
				// It is the start node so add the action to the initialisation section.
				CString strProgramCounterName = cMain.GetPCForNode(iCurrent);
				cMain.AddPCToInitialisation(strProgramCounterName);
			}else{
				CString strProgramCounterName = cMain.GetPCForNode(iCurrent);
				CString strParentAction = strProgramCounterName + _T("'=1");
				cMain.AddExtraNodeAction(iParentOfBlock, strParentAction);
			}
		}
	}

	// If this is a set of alternate selections then create the opposite transition (the NOT case).
	int iType = pcNode->GetType();
	if (iType == GSE_T_CONDITION){ // This is a set of alternate selections.
		CString strOppositeGuard = _T("");
		int iCounter = 0;
		NList<CString, CString>* plOppositeActions = new NList<CString, CString>;
		for (int i = 0; i < (iSiblingNum + 1); i++){
			int iCurrent = pcParent->GetChildID(i);
			
			// Add pcx=1 to the guard and pcx'=0 to the actions, where pcx is the program counter
			// for this sibling.
			CString zeroPC = cMain.GetPCForNode(iCurrent);
			if (iCounter != 0){  // This is not the first sibling.
				strOppositeGuard.Append(_T(" AND "));
			}
			strOppositeGuard.Append(zeroPC + _T("=1"));
			plOppositeActions->AddTail(zeroPC + _T("'=0"));
			
			if (!cMain.IsAtomic(iCurrent)){  // Don't add the guard if the node is atomic; it will be 
											// added later by TranslateParsingMethods.
				strOppositeGuard.Append(_T(" AND NOT(") + cMain.GetOppositeBranch(iCurrent) + _T(")"));
			}	
			iCounter++;
		}
		int iGuardPosition = cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);
		// For each atomic node (if there are any), record that the guard for this extra transition
		// is stored at the given position in the extra transitions list in cMain. This is so that
		// TranslateParsingMethods can later update the extra transition with the guard of the atomic branch.
		for (int j = 0; j < (iSiblingNum + 1); j++){
			int iCurrent = pcParent->GetChildID(j);
			if (cMain.IsAtomic(iCurrent)){  
				CTranslateNode* pcCurrent = cMain.GetNode(iCurrent);
				pcCurrent->SetGuardPosition(iGuardPosition);
				// Set the same guard position for each node in its atomic block.
				// Get the atomic blocks.
				NList<CTranslateAtomicBlock*,CTranslateAtomicBlock*>* pcAtomicBlocks;
				pcAtomicBlocks = cMain.GetAtomicBlocks(iCurrent);
				// Since branching inside an atomic group is no longer allowed, it can only be part of one block.
				CTranslateAtomicBlock* pcBlock = pcAtomicBlocks->GetHead();
				NList<int, int>* plAtomicNodes = pcBlock->GetNodes();
				NPosition cAtomicPosition = plAtomicNodes->GetHeadPosition();
				while (cAtomicPosition.IsNotNull()){
					int iAtomicNode = plAtomicNodes->GetNext(cAtomicPosition);
					CTranslateNode* pcAtomicNode = cMain.GetNode(iAtomicNode);
					pcAtomicNode->SetGuardPosition(iGuardPosition);
				}
			}
		}
	}
}

CTranslateParsingRule* CTranslateRuleAltBranching::FindRule(int iIndex, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
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


void CTranslateRuleAltBranching::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{
	// For each of the siblings.
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	int iSiblingNum = pcNode->GetSiblingNumber();
	int iParent = pcNode->GetParent();
	CTranslateNode* pcParent = cMain.GetNode(iParent);
	CTranslateUTrans* pcTransition;
	NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitionList;
	// Get the parent's pc values.
	int iParentPC = cMain.GetPC(iParent);
	int iParentPCValue = cMain.GetPCValueForNode(iParent);
	int iParentPCLocation = cMain.GetPCLocation(iParentPC);
	// Get which process this pc belongs to.
	int iProcess = cMain.GetProcess(iParentPC);
	int iBranchPC;

	// Translate the top node of each branch.
	for (int i = 0; i < (iSiblingNum + 1); i++){
		int iCurrent = pcParent->GetChildID(i);
		
		// Associate this new PC with the same process as the parent pc.
		iBranchPC = cMain.GetPC(iCurrent);
		cMain.SetProcess(iBranchPC, iProcess);
		cMain.SetPCLocation(iBranchPC, iParentPCLocation + i);
		
		CTranslateParsingRule* pcSecondaryRule;
		pcSecondaryRule = FindRule(i, plSecondaryRules);
		pcSecondaryRule->translateToUPPAAL(cMain,iCurrent,NULL,NULL);

		// Change the source node for this branch to be the parent transition's target node.
		pcTransition = cMain.GetNodeTransition(iCurrent);
		if (pcTransition.IsNotNull()){  // This is a normal node with one transition.
			pcTransition->SetSource(iParentPC, iParentPCValue + 1, 0);
		}else{ // This is a node with multiple transitions.
			plTransitionList = cMain.GetMultipleTransitions(iNode);
			pcTransition = plTransitionList->GetHead();
			pcTransition->SetSource(iParentPC, iParentPCValue + 1, 0);
		}
	}
}