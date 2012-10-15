// File name: TranslateSetCardinality.h
// Author/s : Nisansala Yatapanage
// Date built: 2/11/2006
// Last updated: 2/11/2006
// Purpose: Implementation of the set cardinality rule.
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"
#include "NString.h"

class CTranslateSetCardinality : 
	public CTranslateParsingRule
{
public:
	CTranslateSetCardinality(void);
public:
	~CTranslateSetCardinality(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	CTranslateParsingMethods m_cParsingMethods;
};
