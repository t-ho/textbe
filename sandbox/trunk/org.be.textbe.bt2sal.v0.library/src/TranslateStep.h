// File name: TranslateStep.h
// Author/s : Nisansala Yatapanage
// Date built: 16/6/2006
// Last updated: 24/7/2006
// Purpose: This class stores information about a parsed node,
//	 such as the rule and other nodes involved (e.g. top reversion points).
// Algorithms used:
// Description of Algorithm#:
//
//

#pragma once
#include "NList.h"
#include "NString.h"
// #include "TranslateParsingRule.h"

class CTranslateStep
{
public:
	CTranslateStep(void);
	CTranslateStep(int iNode, int iRule, int iOther, NList<int, int>* plSecondRules);
public:
	~CTranslateStep(void);
public:
	int GetNode(void);
	int GetRule(void);
	int GetSecondaryRule(int iIndex);
	//CTranslateParsingRule* GetRule(void);
	//CTranslateParsingRule* GetSecondaryRule(int iIndex);
	int GetOtherNode(void);
public:
	int m_iNode; // The node involved in this step.
	int m_iRuleID; // The primary rule used to translate it.
	int m_iOtherNode; // Other nodes involved, e.g. top reversion points.
	// Secondary rules, e.g. a branching rule is the primary rule, 
	// state-change rule is the secondary rule.
	NList<int, int>* m_plSecondaryRules; 
};
