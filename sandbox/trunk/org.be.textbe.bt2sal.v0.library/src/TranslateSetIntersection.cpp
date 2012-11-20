// File name: TranslateSetIntersection.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set intersection rule.
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateSetIntersection.h"
#include "TranslateStep.h"
#include "GSEMethod.h"


CTranslateSetIntersection::CTranslateSetIntersection(void)
{
	m_iRuleID = 17;
}

CTranslateSetIntersection::~CTranslateSetIntersection(void)
{
}

bool CTranslateSetIntersection::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	bool bRuleMatched = false;
	NList<int, int> cMatchedNodes;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cLeafNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
		CTranslateNode* pcNode = cMain.GetNode(iCurrentNode);
		if (pcNode->IsNodeSetOperation()){
			int iSiblingNumber = pcNode->GetSiblingNumber();
			if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
				NString strFlag = pcNode->GetFlag();
				if (strFlag == ""){ // Check that there is no flag, e.g. thread kill flag.
					int iNumberOfSetRules = pcNode->GetNumberOfRules();
				//	if ((iNumberOfSetRules == 1) || (iNumberOfSetRules == 2)){
						NString strSetRule1 = pcNode->GetSetRule(0);
					//	if (iNumberOfSetRules == 2){
						/*	NString strSetRule2 = pcNode->GetSetRule(1);
							if (strSetRule1 == "intersection"){
								if (strSetRule2 == "attribute"){
									// This is a set add rule in the form s := s >< t
									cMatchedNodes.AddTail(iCurrentNode);
									m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
									if (bConsiderIfBranching == false){
										NList<int, int>* plEmptyList = new NList<int, int>;
										cMain.StoreTranslationStep(iCurrentNode, 17, NULL, plEmptyList);
									}
									bRuleMatched = true;
								}
							}*/
					//	}else{
							if (strSetRule1 == "intersection"){
								// This is a set add rule in the form s >< t
								cMatchedNodes.AddTail(iCurrentNode);
								m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
								if (bConsiderIfBranching == false){
									NList<int, int>* plEmptyList = new NList<int, int>;
									cMain.StoreTranslationStep(iCurrentNode, 17, NULL, plEmptyList);
								}
								bRuleMatched = true;
							}
					//	}
				//	}
				}
			}
		}
	}
	// Remove the matched nodes from the leaf nodes list and add their parents.
	NPosition cMatchedPosition;
	cMatchedPosition = cMatchedNodes.GetHeadPosition();
	while(cMatchedPosition.IsNotNull()){
		int iMatchedNode;
		iMatchedNode = cMatchedNodes.GetNext(cMatchedPosition);	
		CTranslateNode* pcMatchedNode = cMain.GetNode(iMatchedNode);
		NPosition cNodePosition = cLeafNodes.Find(iMatchedNode);
		cLeafNodes.RemoveAt(cNodePosition);
		if (bConsiderIfBranching == false){ // Don't add the parent otherwise.
			int iParentNode = pcMatchedNode->GetParent();
			if (iParentNode != iFinalNode){  // This isn't the final node.
				cLeafNodes.AddTail(iParentNode);
			}
		}
	}
	return bRuleMatched;
}

void CTranslateSetIntersection::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = "";
	NString strAction = "";
	NList<NString, NString>* plActions = new NList<NString, NString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	
	NString strSetName;
	NString strSecondSet;
	NString strSetType;

//	if (pcNode->GetNumberOfRules() == 1){ // It is in the form s >< t
		strSetName = pcNode->GetSetVariable(0);
		strSetType = cMain.GetSetType(strSetName, pcNode);
		strSecondSet = pcNode->GetSetVariable(1);

//	}else if (pcNode->GetNumberOfRules() == 2){  // It is in the form s := s >< t
	//	strSetName = pcNode->GetSetVariable(0);
	//	strSetType = cMain.GetSetType(strSetName, pcNode);
	//	strSecondSet = pcNode->GetSetVariable(2);
	//	strSecondSet = cMain.TrimChangeCase(strSecondSet,false);
		NString strComponent = pcNode->GetComponentName();
		
		// Assumed that the variable at index 1 is just the same as 
		// the one at index 0, since it is just the set name.

		// Only add the component name if it is different to the set name,
		// otherwise this is a top-level set, not belonging to another component.
		if (strSetName != strComponent){
			strSetName = cMain.TrimChangeCase(strComponent,false) + "_" + cMain.TrimChangeCase(strSetName,true);
		}else{
			strSetName = cMain.TrimChangeCase(strSetName,true);
		}
//	}
	strAction = strSetName + "'=set{" + strSetType + "}!intersection(" + strSetName + "," + strSecondSet + ")";
	plActions->AddTail(strAction);

	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
