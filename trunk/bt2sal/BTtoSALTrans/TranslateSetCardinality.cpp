// File name: TranslateSetCardinality.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set cardinality rule.
//
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateSetCardinality.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateSetCardinality::CTranslateSetCardinality(void)
{
	m_iRuleID = 15;
}

CTranslateSetCardinality::~CTranslateSetCardinality(void)
{
}

bool CTranslateSetCardinality::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
				if (strFlag == _T("")){ // Check that there is no flag, e.g. thread kill flag.
				//	int iNumberOfSetRules = pcNode->GetNumberOfRules();
				//	if ((iNumberOfSetRules == 2) || (iNumberOfSetRules == 3)){
						NString strSetRule1 = pcNode->GetSetRule(0);
				//		NString strSetRule2 = pcNode->GetSetRule(1);
				//		if (iNumberOfSetRules == 2){
							if (strSetRule1 == _T("cardinality")){
								// Check that the second rule is a boolean symbol.
						//		if (pcNode->IsBoolSymbol(strSetRule2)){ 
								// This is a set cardinality rule in the form |s| boolSymbol number
									cMatchedNodes.AddTail(iCurrentNode);
									m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
									if (bConsiderIfBranching == false){
										NList<int, int>* plEmptyList = new NList<int, int>;
										cMain.StoreTranslationStep(iCurrentNode, 15, NULL, plEmptyList);
									}
									bRuleMatched = true;
						//		}
							}
				//		}
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

void CTranslateSetCardinality::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	NString strGuard = _T("");
	NString strAction = _T("");
	NList<NString, NString>* plActions = new NList<NString, NString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	
	NString strSetName = pcNode->GetSetVariable(0);
	NString strSetType = cMain.GetSetType(strSetName, pcNode);
	NString strNumber = pcNode->GetSetVariable(1);
	NString strComponent = pcNode->GetComponentName();

	if (strSetName != strComponent){ // The set is an attribute.
		strSetName = cMain.TrimChangeCase(strComponent,false) + _T("_") + cMain.TrimChangeCase(strSetName,true);
	}else{
		strSetName = cMain.TrimChangeCase(strSetName,true);
	}
	int iNumber = _ttoi(strNumber.GetString().c_str());
	
	NString strBooleanSymbol = pcNode->GetSetRule(1);
	if (strBooleanSymbol == _T("LessThan")){
		strGuard = _T("(set{") + strSetType + _T("}!empty?(") + strSetName + _T(")");
		for (int i = 1; i < iNumber; i++){
			strGuard = strGuard + _T(" OR set{") + strSetType + _T("}!size?(") + strSetName + _T(",");
			strGuard.Format(strGuard + _T("%d"), i);
			strGuard = strGuard + _T(")");
		}
		strGuard = strGuard + _T(")");

	}else if (strBooleanSymbol == _T("LessThanOrEqual")){
		strGuard = _T("(set{") + strSetType + _T("}!empty?(") + strSetName + _T(")");
		for (int i = 1; i <= iNumber; i++){
			strGuard = strGuard + _T(" OR set{") + strSetType + _T("}!size?(") + strSetName + _T(",");
			strGuard.Format(strGuard + _T("%d"), i);
			strGuard = strGuard + _T(")");
		}
		strGuard = strGuard + _T(")");

	}else if (strBooleanSymbol == _T("EqualTo")){
		strGuard = _T("set{") + strSetType + _T("}!size?(") + strSetName + _T(",") + strNumber + _T(")");
	
	}else if (strBooleanSymbol == _T("GreaterThan")){
		strGuard = _T("NOT(set{") + strSetType + _T("}!empty?(") + strSetName + _T(")");
		for (int i = 1; i <= iNumber; i++){
			strGuard = strGuard + _T(" OR set{") + strSetType + _T("}!size?(") + strSetName + _T(",");
			strGuard.Format(strGuard + _T("%d"), i);
			strGuard = strGuard + _T(")");
		}
		strGuard = strGuard + _T(")");

	}else if (strBooleanSymbol == _T("GreaterThanOrEqual")){
		strGuard = _T("NOT(set{") + strSetType + _T("}!empty?(") + strSetName + _T(")");
		for (int i = 1; i < iNumber; i++){
			strGuard = strGuard + _T(" OR set{") + strSetType + _T("}!size?(") + strSetName + _T(",");
			strGuard.Format(strGuard + _T("%d"), i);
			strGuard = strGuard + _T(")");
		}
		strGuard = strGuard + _T(")");
	}
	
	if (pcNode->GetType() == GSE_T_CONDITION){
		// Create an extra transition for the opposite branch.
		NString strProgramCounterName = cMain.GetPCForNode(iNode);
		int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
		NString strOppositeGuard = strProgramCounterName + _T("=");
		strOppositeGuard.Format(strOppositeGuard + _T("%d"), iProgramCounterValue);
		strOppositeGuard = strOppositeGuard + _T(" AND NOT (");
		strOppositeGuard = strOppositeGuard + strGuard + _T(")");
		NList<NString, NString>* plOppositeActions = new NList<NString, NString>;
		plOppositeActions->AddTail(strProgramCounterName + _T("'=0"));
		if (cMain.GetTranslationType() == 4){
			strOppositeGuard = strOppositeGuard + _T(" AND NOT(messageReady)");
		}
		cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	
	}
	
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
