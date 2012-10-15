// File name: TranslateParsingMethods.h
// Author/s : Nisansala Yatapanage
// Date built: 7/7/2006
// Last updated: 15/7/2006
// Purpose: This class handles some common operations required
//			by the rule classes.
// Algorithms used:
// Description of Algorithm#:
//
//

#pragma once
#include "TranslateSALMain.h"
#include "TranslateAtomicBlock.h"
#include "TranslateParsingRule.h"
#include "NString.h"
//#include "TranslateUPPAAL.h"

class CTranslateParsingMethods : public CObject
{
public:
	CTranslateParsingMethods(void);
public:
	~CTranslateParsingMethods(void);
public:
	void CheckForAtomic(CTranslateSALMain& cMain, int iCurrentNode);
public:
	void StoreNodeTransition(CTranslateSALMain& cTranslateMain, int iNode, NString strGuard, NList<NString, NString>* plActions, int iParent, bool bIsExternal, bool bIsInternalInput);
	CTranslateParsingRule* GetRule(int iRuleID);
	//void StoreUPPAALTransition(CTranslateUPPAAL& cTranslateMain, int iNode, NString strLabel, int iLabelType);
	//void StoreMultipleUPPAALTransition(CTranslateUPPAAL& cTranslateMain, int iNode, NList<CTranslateUTrans*, CTranslateUTrans*>* plTransitions, bool bDoClocks);
	//void StoreUPPAALManyLabels(CTranslateUPPAAL& cTranslateMain, int iNode, NList<NString, NString>* plLabels, NList<int, int>* plLabelTypes);
};
