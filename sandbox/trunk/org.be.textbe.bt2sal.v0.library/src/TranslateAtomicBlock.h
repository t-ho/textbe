// File name: TranslateAtomicBlock.h
// Author/s : Nisansala Yatapanage
// Date built: 19/7/2006
// Last updated: 19/7/2006
// Purpose: This class stores information about a group of atomic nodes.
// Algorithms used:
// Description of Algorithm#:
//
//

#pragma once
#include "NList.h"
#include "NString.h"


class CTranslateAtomicBlock
{
public:
	CTranslateAtomicBlock(void);
public:
	~CTranslateAtomicBlock(void);
public:
	NList<int, int>* GetNodes();
public:
	int GetTopNode(void);
public:
	int GetBottomNode(void);
public:
	bool ContainsNode(int iNode);
public:
	void AddNodeBelow(int iNode);
public:
	void AddNodeAbove(int iNode);
public:
	void SetExternal(void);
public:
	bool ContainsExternal(void);
public:
	void SetInternalInput(void);
public:
	bool ContainsInternalInput(void);
	NList<int, int>* GetProgramCounters(void);
	void AddNewProgramCounter(int iPC);
public:
	void SortIntoViews(void);
	NList<int, int> m_lNodes;
	bool m_bContainsExternal;
	bool m_bContainsInternal;
	NList<int, int>* m_plProgramCounters;
};
