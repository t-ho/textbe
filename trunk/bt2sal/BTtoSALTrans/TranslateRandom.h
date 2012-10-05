#pragma once

#include "TranslateNode.h"

class CTranslateRandom
{
public:
	CTranslateRandom();
	CTranslateNode* CreateRandomBT(CString strIterations);
	CTranslateNode* GetListElement(CList<CTranslateNode* , CTranslateNode* >& cList, int iPosition);
	CTranslateNode* CreateNewNode();
	CTranslateNode* GetNode(int iNodeID);
	void RemoveFromList(CList<CTranslateNode*, CTranslateNode*>& cList, int iIndex);
	void DeleteNodes();
	int m_iNumberOfComponents;
	int m_iNumberOfStates;	
	CMap<int, int, CTranslateNode*, CTranslateNode*> m_mIDsToNodes;
	int m_iNumberOfNodes;  // The total number of nodes in the BT.
	int m_iNumberOfBranches; // The total number of sets of branches in the BT.
	int m_iNumberOfReversions;  // The total number of reversions in the BT.
	int m_iNumberOfMacros;  // The total number of macros in the BT.
	int m_iNumberOfThreadKills;  // The total number of thread kills in the BT.
	int GetNumberOfNodes();
	int GetNumberOfBranches();
	int GetNumberOfReversions();
	int GetNumberOfMacros();
	int GetNumberOfThreadKills();

public:
	~CTranslateRandom(void);
};
