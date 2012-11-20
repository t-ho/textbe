// File name: TranslateSetEmpty.h
// Author/s : Nisansala Yatapanage
// Date built: 2/6/2006
// Last updated: 21/7/2006
// Purpose: Implementation of the empty set rule.
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"
#include "NString.h"

class CTranslateSetEmpty : 
	public CTranslateParsingRule
{
public:
	CTranslateSetEmpty(void);
public:
	~CTranslateSetEmpty(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	CTranslateParsingMethods m_cParsingMethods;
};
