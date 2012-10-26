// File name: TranslateRuleSelDisjunct.h
// Author/s : Nisansala Yatapanage
// Date built: 13/10/2006
// Last updated: 13/10/2006
// Purpose: Implementation of the selection disjunction rule (Rule 10).
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"

class CTranslateRuleSelDisjunct : 
	public CTranslateParsingRule
{
public:
	CTranslateRuleSelDisjunct(void);
public:
	~CTranslateRuleSelDisjunct(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	void translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	CTranslateParsingMethods m_cParsingMethods;
};

