// File name: TranslateSetEmpty.cpp
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the empty set rule.
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateSetEmpty.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateSetEmpty::CTranslateSetEmpty(void)
{
	m_iRuleID = 16;
}

CTranslateSetEmpty::~CTranslateSetEmpty(void)
{
}

bool CTranslateSetEmpty::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
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
				CString strFlag = pcNode->GetFlag();
				if (strFlag == _T("")){ // Check that there is no flag, e.g. thread kill flag.
					int iNodeType = pcNode->GetType();
					if (iNodeType == GSE_T_STATE){ // State-change, so either t[s:={}] or t[{}]
					//	int iNumberOfSetRules = pcNode->GetNumberOfRules();
					//	if ((iNumberOfSetRules == 1) || (iNumberOfSetRules == 2)){
							CString strSetRule1 = pcNode->GetSetRule(0);
						//	if (iNumberOfSetRules == 2){
							//	CString strSetRule2 = pcNode->GetSetRule(1);
						/*		if (strSetRule1 == _T("empty")){
									if (strSetRule2 == _T("attribute")){
										// This is a set empty rule in the form s := {}
										cMatchedNodes.AddTail(iCurrentNode);
										m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
										if (bConsiderIfBranching == false){
											NList<int, int>* plEmptyList = new NList<int, int>;
											cMain.StoreTranslationStep(iCurrentNode, 16, NULL, plEmptyList);
										}
										bRuleMatched = true;
									}
								}*/
						//	}else{
								if (strSetRule1 == _T("empty")){
									// This is a set empty rule in the form s := {}
									cMatchedNodes.AddTail(iCurrentNode);
									m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
									if (bConsiderIfBranching == false){
										NList<int, int>* plEmptyList = new NList<int, int>;
										cMain.StoreTranslationStep(iCurrentNode, 16, NULL, plEmptyList);
									}
									bRuleMatched = true;
								}
						//	}
					//	}
					}else if ((iNodeType == GSE_T_CONDITION) || (iNodeType == GSE_T_GUARD)){ // Selection, so t?s={}? or t?{}?
						int iNumberOfSetRules = pcNode->GetNumberOfRules();
				//		if ((iNumberOfSetRules == 1) || (iNumberOfSetRules == 2) || (iNumberOfSetRules == 3)){
							CString strSetRule1 = pcNode->GetSetRule(0);
							if (iNumberOfSetRules == 1){
						//		CString strSetRule2 = pcNode->GetSetRule(1);
						//		if (strSetRule1 == _T("EqualTo")){
									if (strSetRule1 == _T("empty")){
										// This is a set empty rule in the form s = {}
										cMatchedNodes.AddTail(iCurrentNode);
										m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
										if (bConsiderIfBranching == false){
											NList<int, int>* plEmptyList = new NList<int, int>;
											cMain.StoreTranslationStep(iCurrentNode, 16, NULL, plEmptyList);
										}
										bRuleMatched = true;
									}
						//		}
							}else{
								CString strSetRule2 = pcNode->GetSetRule(1);
							//	CString strSetRule3 = pcNode->GetSetRule(2);
							//	if (strSetRule1 == _T("EqualTo")){
									if (strSetRule1 == _T("empty")){
										if (strSetRule2 == _T("NOT")){
											// This is a set empty rule in the form NOT(s = {})
											cMatchedNodes.AddTail(iCurrentNode);
											m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
											if (bConsiderIfBranching == false){
												NList<int, int>* plEmptyList = new NList<int, int>;
												cMain.StoreTranslationStep(iCurrentNode, 16, NULL, plEmptyList);
											}
											bRuleMatched = true;
										}
									}
							}
							//	}
						//	}else{
							/*	if (strSetRule1 == _T("empty")){
									// This is a set add rule in the form {}
									cMatchedNodes.AddTail(iCurrentNode);
									m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
									if (bConsiderIfBranching == false){
										NList<int, int>* plEmptyList = new NList<int, int>;
										cMain.StoreTranslationStep(iCurrentNode, 16, NULL, plEmptyList);
									}
									bRuleMatched = true;
								} */
						//	}
				//		}
					}
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

void CTranslateSetEmpty::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
	CString strGuard = _T("");
	CString strAction = _T("");
	NList<CString, CString>* plActions = new NList<CString, CString>;
	CTranslateNode* pcNode = cMain.GetNode(iNode);
	CString strFullSetName;
	
	CString strSetName = pcNode->GetSetVariable(0);
	CString strSetType = cMain.GetSetType(strSetName, pcNode);
	CString strComponent = pcNode->GetComponentName();
	
	if (strSetName != strComponent){
		strFullSetName = cMain.TrimChangeCase(strComponent,false) + _T("_") + cMain.TrimChangeCase(strSetName,true);
	}else{
		strFullSetName = cMain.TrimChangeCase(strSetName,true);
	}
	
	if (pcNode->GetType() == GSE_T_STATE){ // State realisation. It is in the form s := {}
		strAction = strFullSetName + _T("'=set{") + strSetType + _T("}!empty_set");
		plActions->AddTail(strAction);
	
	}else if ((pcNode->GetType() == GSE_T_CONDITION) || (pcNode->GetType() == GSE_T_GUARD)){ // Selection.
		if (pcNode->GetNumberOfRules() == 1){ // It is in the form s = {}
			strGuard = _T("set{") + strSetType + _T("}!empty?(") + strFullSetName + _T(")");

		}else{ // It is in the form NOT(s = {})
			strGuard = _T("NOT(set{") + strSetType + _T("}!empty?(") + strFullSetName + _T("))");
		}

		if (pcNode->GetType() == GSE_T_CONDITION){
			// Create an extra transition for the opposite branch.
			CString strProgramCounterName = cMain.GetPCForNode(iNode);
			int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
			CString strOppositeGuard = strProgramCounterName + _T("=");
			strOppositeGuard.Format(strOppositeGuard + _T("%d"), iProgramCounterValue);
			strOppositeGuard = strOppositeGuard + _T(" AND NOT (");
			strOppositeGuard = strOppositeGuard + strGuard + _T(")");
			NList<CString, CString>* plOppositeActions = new NList<CString, CString>;
			plOppositeActions->AddTail(strProgramCounterName + _T("'=0"));
			if (cMain.GetTranslationType() == 4){
				strOppositeGuard = strOppositeGuard + _T(" AND NOT(messageReady)");
			}
			cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	
		}
	}

	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);
}
