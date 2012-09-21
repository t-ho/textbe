// File name: TranslateParsingRule.cpp
// Author/s : Nisansala Yatapanage
// Date built: 5/6/2006
// Last updated: 21/7/2006
// Purpose: This is the interface for all rule implementations.
// Algorithms used:
// Description of Algorithm#:
//
//
#include "StdAfx.h"
#include "TranslateParsingRule.h"
#ifdef _DEBUG
#define new DEBUG_NEW
#endif

CTranslateParsingRule::CTranslateParsingRule(void)
{
	m_iRuleID = 0;
}

CTranslateParsingRule::~CTranslateParsingRule(void)
{
}

bool CTranslateParsingRule::applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules)
{
	return false;
}
	
void CTranslateParsingRule::translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{

}

void CTranslateParsingRule::translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules)
{

}

int CTranslateParsingRule::getID(){
	return m_iRuleID;
}