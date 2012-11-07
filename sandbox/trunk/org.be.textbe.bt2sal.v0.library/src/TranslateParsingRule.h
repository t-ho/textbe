// File name: TranslateParsingRule.h
// Author/s : Nisansala Yatapanage
// Date built: 5/6/2006
// Last updated: 21/7/2006
// Purpose: This is the interface for all rule implementations.
// Algorithms used:
// Description of Algorithm#:
//
//
#pragma once

#include "TranslateSALMain.h"
#include "NString.h"
#include <tchar.h>

class CTranslateParsingRule
{
public:
	CTranslateParsingRule(void);
public:
	virtual ~CTranslateParsingRule(void);

public:
	virtual bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	virtual void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
//	virtual void translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	int getID();
protected:
	int m_iRuleID;
};
