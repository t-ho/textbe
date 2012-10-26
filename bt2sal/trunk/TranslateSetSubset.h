// File name: TranslateSetSubset.h
// Author/s : Nisansala Yatapanage
// Date built: 21/12/2006
// Last updated: 21/12/2006
// Purpose: Implementation of the set rule for 
//			checking if a set is a subset of another.
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"

class CTranslateSetSubset : 
	public CTranslateParsingRule
{
public:
	CTranslateSetSubset(void);
public:
	~CTranslateSetSubset(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	CTranslateParsingMethods m_cParsingMethods;
};

