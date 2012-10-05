// File name: TranslateRuleMacro.h
// Author/s : Nisansala Yatapanage
// Date built: 24/7/2006
// Last updated: 24/7/2006
// Purpose: Implementation of the go-to rule.
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateParsingRule.h"
#include "TranslateParsingMethods.h"

class CTranslateRuleMacro : 
	public CTranslateParsingRule
{
public:
	CTranslateRuleMacro(void);
public:
	~CTranslateRuleMacro(void);
public:
	bool applyBackwards(CTranslateSALMain& cMain, NList<int, int>& cLeafNodes, NList<int, int>& cAllNodes, int iFinalNode, NList<int, int>& cInitNodes, bool bConsiderIfBranching, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plRules);
	void translateToSAL(CTranslateSALMain& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	void translateToUPPAAL(CTranslateUPPAAL& cMain, int iNode, int iOtherNode, NList<CTranslateParsingRule*, CTranslateParsingRule*>* plSecondaryRules);
	bool ContainsPCUpdate(NList<CString, CString>* plList, CString strPCName);
	CTranslateParsingMethods m_cParsingMethods;
};
