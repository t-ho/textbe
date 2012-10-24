// File name: TranslateRuleSelConjunct.h
// Author/s : Nisansala Yatapanage
// Date built: 13/10/2006
// Last updated: 13/10/2006
// Purpose: Implementation of the selection conjunction rule (Rule 9).
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"
#include "NString.h"

class CTranslateRuleSelConjunct : 
	public CTranslateParsingRule
{
public:
	CTranslateRuleSelConjunct(void);
public:
	~CTranslateRuleSelConjunct(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
//	void translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	CTranslateParsingMethods m_cParsingMethods;
};
