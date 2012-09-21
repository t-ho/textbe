// File name: TranslateRuleSelConjunct.cpp
// Author/s : Nisansala Yatapanage
// Date built: 13/10/2006
// Last updated: 16/10/2006
// Purpose: Implementation of the selection conjunction rule (Rule 9).
//
// Algorithms used:
// Description of Algorithm#:
//
/////// NOTE: This class is not correct and not finished. ///////////////////
#include "StdAfx.h"
#include "TranslateRuleSelConjunct.h"
#include "TranslateStep.h"
#include "GSEMethod.h"

CTranslateRuleSelConjunct::CTranslateRuleSelConjunct(void)
{
	m_iRuleID = 9;
}

CTranslateRuleSelConjunct::~CTranslateRuleSelConjunct(void)
{
}

bool CTranslateRuleSelConjunct::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
/*	bool bRuleMatched = false;
	NList<int, int> cMatchedNodes;
	NPosition cCurrentNodePosition;
	cCurrentNodePosition = cLeafNodes.GetHeadPosition();
	while(cCurrentNodePosition.IsNotNull()){
		int iCurrentNode;
		iCurrentNode = cLeafNodes.GetNext(cCurrentNodePosition);
		int iStateType = CGSEDataManager::s_pcDataManager->GetNodeDecoration(iCurrentNode);
		int iSiblingNumber = CGSEDataManager::s_pcDataManager->GetNodeSiblingNum(iCurrentNode);
		if ((iStateType == GSE_T_STATE) || (iStateType == GSE_T_CONDITION) || (iStateType == GSE_T_EVENT) || (iStateType == GSE_T_GUARD) || (iStateType == GSE_T_INPUT) || (iStateType == GSE_T_OUTPUT) || (iStateType == GSE_T_INPUT1)){
			if ((iCurrentNode != iFinalNode) && ((iSiblingNumber == 0) || (bConsiderIfBranching == true))){   
				// The node is a sequential node.
				cMatchedNodes.AddTail(iCurrentNode);
				if (bConsiderIfBranching == false){
					m_cParsingMethods.CheckForAtomic(cMain, iCurrentNode);
					NList<int, int>* plEmptyList = new NList<int, int>;
					cMain.StoreTranslationStep(iCurrentNode, 1, NULL, plEmptyList);
				}
				bRuleMatched = true;
			}
		}
	}
	// Remove the matched nodes from the leaf nodes list and add their parents.
	NPosition cMatchedPosition;
	cMatchedPosition = cMatchedNodes.GetHeadPosition();
	while(cMatchedPosition.IsNotNull()){
		int iMatchedNode;
		iMatchedNode = cMatchedNodes.GetNext(cMatchedPosition);	
		NPosition cNodePosition = cLeafNodes.Find(iMatchedNode);
		cLeafNodes.RemoveAt(cNodePosition);
		if (bConsiderIfBranching == false){ // Don't add the parent otherwise.
//			int iParentNode = CGSEDataManager::s_pcDataManager->GetNodeParentID(iMatchedNode);
			if (iParentNode != iFinalNode){  // This isn't the final node.
				cLeafNodes.AddTail(iParentNode);
			}
		}
	}
	return bRuleMatched;*/
	return NULL;
}

void CTranslateRuleSelConjunct::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules) 
{
/*	CString strGuard = _T("");
	CString strAction = _T("");
	NList<CString, CString>* plActions = new NList<CString, CString>;

	CString strComponentName = CGSEDataManager::s_pcDataManager->GetNodeComponent(iNode);
	CString strStateName = CGSEDataManager::s_pcDataManager->GetNodeState(iNode);
	strComponentName = cMain.TrimChangeCase(strComponentName, false);
	strStateName = cMain.TrimChangeCase(strStateName, false);
	int iStateType = CGSEDataManager::s_pcDataManager->GetNodeDecoration(iNode);
	if (iStateType == GSE_T_STATE){ // State-realisation ([s])
		strAction = strComponentName + _T("'=") + strComponentName + _T("_") + strStateName;
		plActions->AddTail(strAction);
		cMain.AddLocalVariable(strComponentName, strStateName);

	}else if (iStateType == GSE_T_CONDITION){ // Selection (?s?)
		strGuard = strComponentName + _T("=") + strComponentName + _T("_") + strStateName;
		cMain.AddLocalVariable(strComponentName, strStateName);
		
		// Create an extra transition for the opposite branch.
		CString strProgramCounterName = cMain.GetPCForNode(iNode);
		int iProgramCounterValue = cMain.GetPCValueForNode(iNode);
		CString strOppositeGuard = strProgramCounterName + _T("=");
		strOppositeGuard.Format(strOppositeGuard + _T("%d"), iProgramCounterValue);
		strOppositeGuard = strOppositeGuard + _T(" AND NOT (") + strComponentName;
		strOppositeGuard = strOppositeGuard + _T("=") + strComponentName + _T("_") + strStateName + _T(")");
		NList<CString, CString>* plOppositeActions = new NList<CString, CString>;
		plOppositeActions->AddTail(strProgramCounterName + _T("'=0"));
		if (cMain.GetTranslationType() == 4){
			strOppositeGuard = strOppositeGuard + _T(" AND NOT(messageReady)");
		}
		cMain.AddExtraTransition(strOppositeGuard, plOppositeActions);	

	}else if ((iStateType == GSE_T_EVENT) || (iStateType == GSE_T_INPUT)){ //Event (??s?? or >>s<<)
		CString strExtInputVariable = _T("extInMsg_") + strComponentName + _T("_") + strStateName;
		strGuard = strExtInputVariable + _T("=true");
		cMain.AddInputVariable(strExtInputVariable);
		
	}else if (iStateType == GSE_T_GUARD){  // Guard (???s???)
		strGuard = strComponentName + _T("=") + strComponentName + _T("_") + strStateName;
		cMain.AddLocalVariable(strComponentName, strStateName);
	
	}else if (iStateType == GSE_T_OUTPUT){ // External output (<<s>>)
		CString strExtOutVariable = _T("extOutMsg_") + strComponentName + _T("_") + strStateName;
		cMain.AddOutputVariable(strExtOutVariable);
		strExtOutVariable = strExtOutVariable + _T("'=true");
		plActions->AddTail(strExtOutVariable);
	
	}else if (iStateType == GSE_T_INPUT1){ // Internal input (>s<)
		strComponentName = cMain.TrimChangeCase(strComponentName,false);
		CString strIntInputVariable = _T("intInMsg_") + strComponentName + _T("_") + strStateName;
		strGuard = strIntInputVariable + _T("=true");
		cMain.AddLocalBoolean(strIntInputVariable);
	}
	m_cParsingMethods.StoreNodeTransition(cMain, iNode, strGuard, plActions, NULL, false, false);*/
}


void CTranslateRuleSelConjunct::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{

}
