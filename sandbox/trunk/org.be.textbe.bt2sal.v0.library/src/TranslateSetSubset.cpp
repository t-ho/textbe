// File name: TranslateSetSubset.cpp
// Author/s : Nisansala Yatapanage
// Date built: 21/12/2006
// Last updated: 21/12/2006
// Purpose: Implementation of the set rule for testing whether
//			a set is a sub-set of another set.
// Algorithms used:
// Description of Algorithm#:
//


#include "TranslateSetSubset.h"
#include "TranslateStep.h"
#include "GSEMethod.h"
#include <tchar.h>

CTranslateSetSubset::CTranslateSetSubset(void)
{
	m_iRuleID = 19;
}

CTranslateSetSubset::~CTranslateSetSubset(void)
{
}

bool CTranslateSetSubset::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
				//	int iNumberOfSetRules = pcNode->GetNumberOfRules();
				//	if (iNumberOfSetRules == 1){
						NString strSetRule1 = pcNode->GetSetRule(0);
						if (strSetRule1 == "subset"){
							// This is a set add rule in the form a : t
							cMatchedNodes.AddTail(iCurrentNode);
							m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
							if (bConsiderIfBranching == false){
								NList<int, int>* plEmptyList = new NList<int, int>;
								cMain.StoreTranslationStep(iCurrentNode, 19, NULL, plEmptyList);
							}
							bRuleMatched = true;
						}
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

void CTranslateSetSubset::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = "";
	NString strAction = "";
	NList<NString, NString>* plActions = new NList<NString, NString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	
	NString strSetName = pcNode->GetSetVariable(0);
	NString strSetType = cMain.GetSetType(strSetName, pcNode);
	NString strSecondSet = pcNode->GetSetVariable(1);
	strSecondSet = cMain.TrimChangeCase(strSecondSet,true);
	NString strComponent = pcNode->GetComponentName();
	if (strSetName != strComponent){ // The set is an attribute.
		strSetName = cMain.TrimChangeCase(strComponent,false) + "_" + cMain.TrimChangeCase(strSetName,true);
	}else{
		strSetName = cMain.TrimChangeCase(strSetName,true);
	}
	strGuard = "set{" + strSetType + "}!subset?(" + strSetName + "," + strSecondSet + ")";

	if (pcNode->GetType() == GSE_T_CONDITION){
		// Create an extra transition for the opposite branch.
		NString strProgramCounterName = cMain.GetPCForNode(iNode);
		int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
		NString strOppositeGuard = strProgramCounterName + "=";
		strOppositeGuard.Format(strOppositeGuard + "%d", iProgramCounterValue);
		strOppositeGuard = strOppositeGuard + " AND NOT (";
		strOppositeGuard = strOppositeGuard + strGuard + ")";
		NList<NString, NString>* plOppositeActions = new NList<NString, NString>;
		plOppositeActions->AddTail(strProgramCounterName + "'=0");
		if (cMain.GetTranslationType() == 4){
			strOppositeGuard = strOppositeGuard + " AND NOT(messageReady)";
		}
		cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	
	}

	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
