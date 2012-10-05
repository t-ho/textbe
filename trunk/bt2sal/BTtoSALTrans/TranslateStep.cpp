// File name: TranslateStep.cpp
// Author/s : Nisansala Yatapanage
// Date built: 16/6/2006
// Last updated: 24/7/2006
// Purpose: This class stores information about a parsed node,
//	 such as the rule and other nodes involved (e.g. top reversion points).
// Algorithms used:
// Description of Algorithm#:
//
//
#include "StdAfx.h"
#include "TranslateStep.h"
#include "NList.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif
CTranslateStep::CTranslateStep(int iNode, int iRule, int iOther, NList<int, int>* plSecondRules)
{
	m_iNode = iNode;
	m_iRuleID = iRule;
	m_iOtherNode = iOther;
	m_plSecondaryRules = plSecondRules;
}

CTranslateStep::CTranslateStep(void)
{
}

CTranslateStep::~CTranslateStep(void)
{
	delete m_plSecondaryRules;
}

int CTranslateStep::GetRule(void)
{
	return m_iRuleID;
}

int CTranslateStep::GetSecondaryRule(int iIndex)
{
	NPosition cPosition = m_plSecondaryRules->GetHeadPosition();
	int iCounter = 0;
	int iSelectedRule = 0;
	while (cPosition.IsNotNull()){
		int iRule = m_plSecondaryRules->GetNext(cPosition);
		if (iCounter == iIndex){
			iSelectedRule = iRule;
		}
		iCounter++;
	}
	return iSelectedRule;
}

int CTranslateStep::GetNode(void)
{
	return m_iNode;
}
int CTranslateStep::GetOtherNode(void)
{
	return m_iOtherNode;
}
/*
CTranslateParsingRule* CTranslateStep::GetRule(void)
{
	if (m_iRuleID == 1){
		CTranslateParsingRule* pcRule = new CTranslateRuleSequential();
		return pcRule;
	}else if (m_iRuleID == 2){
		CTranslateParsingRule* pcRule = new CTranslateRuleInternal();
		return pcRule;
	}else if (m_iRuleID == 3){
		CTranslateParsingRule* pcRule = new CTranslateRuleConBranching();
		return pcRule;
	}else if (m_iRuleID == 4){
		CTranslateParsingRule* pcRule = new CTranslateRuleAltBranching();
		return pcRule;
	}else if (m_iRuleID == 5){
		CTranslateParsingRule* pcRule = new CTranslateRuleMacro();
		return pcRule;
	}else if (m_iRuleID == 6){
		// change this to return the synchronisation rule.
		return NULL;
	}else if (m_iRuleID == 7){
		CTranslateParsingRule* pcRule = new CTranslateRuleThreadKill();
		return pcRule;
	}else if (m_iRuleID == 8){
		CTranslateParsingRule* pcRule = new CTranslateRuleReversion();
		return pcRule;
	}else if (m_iRuleID == 9){
		CTranslateParsingRule* pcRule = new CTranslateRuleSelConjunct();
		return pcRule;
	}else if (m_iRuleID == 10){
		CTranslateParsingRule* pcRule = new CTranslateRuleSelDisjunct();
		return pcRule;
	}else{
		return NULL;
	}
}

CTranslateParsingRule* CTranslateStep::GetSecondaryRule(int iIndex)
{
	NPosition cPosition = m_plSecondaryRules->GetHeadPosition();
	int iCounter = 0;
	int iSelectedRule = 0;
	while (cPosition.IsNotNull()){
		int iRule = m_plSecondaryRules->GetNext(cPosition);
		if (iCounter == iIndex){
			iSelectedRule = iRule;
		}
		iCounter++;
	}
	if (iSelectedRule != 0){
		if (iSelectedRule == 1){
			CTranslateParsingRule* pcRule = new CTranslateRuleSequential();
			return pcRule;
		}else if (iSelectedRule == 2){
			CTranslateParsingRule* pcRule = new CTranslateRuleInternal();
			return pcRule;
		}else if (iSelectedRule == 3){
			CTranslateParsingRule* pcRule = new CTranslateRuleConBranching();
			return pcRule;
		}else if (iSelectedRule == 4){
			CTranslateParsingRule* pcRule = new CTranslateRuleAltBranching();
			return pcRule;
		}else if (iSelectedRule == 5){
			CTranslateParsingRule* pcRule = new CTranslateRuleMacro();
			return pcRule;
		}else if (iSelectedRule == 6){
			// change this to return the synchronisation rule.
			return NULL;
		}else if (iSelectedRule == 7){
			CTranslateParsingRule* pcRule = new CTranslateRuleThreadKill();
			return pcRule;
		}else if (iSelectedRule == 8){
			CTranslateParsingRule* pcRule = new CTranslateRuleReversion();
			return pcRule;
		}else if (iSelectedRule == 9){
			CTranslateParsingRule* pcRule = new CTranslateRuleSelConjunct();
			return pcRule;
		}else if (iSelectedRule == 10){
			CTranslateParsingRule* pcRule = new CTranslateRuleSelDisjunct();
			return pcRule;
		}else{
			return NULL;
		}
	}
	return NULL;
}
*/

