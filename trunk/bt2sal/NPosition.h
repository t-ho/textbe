#pragma once
#include <list>
//#include "TranslateNode.h"
//#include "TranslateAtomicBlock.h"
class CTranslateNode;
class CAtomicBlock;


class NPosition 
{
public:
	NPosition(void);
public:
	~NPosition(void);
public:
	void SetPointer(std::list<int> &intList);
	void SetPointer(std::list<CTranslateNode*> &nodeList);
//	void SetPointer(std::list<CTranslateAtomicBlock*>::iterator atomicPointer);
	std::list<int>::iterator GetPointer(int iType);
	std::list<CTranslateNode*>::iterator GetPointer(CTranslateNode* pcType);
	bool IsNotNull();
	void SetIsNull();
	void IncrementPointer();
//	std::list<CTranslateAtomicBlock*>::iterator GetPointer(CTranslateAtomicBlock* pcType);
		
public:
	int m_iType; //1 = int, 2 = TranslateNode*.
	std::list<int>::iterator m_intPointer;
	//std::list<CString> m_stringlist;
	std::list<CTranslateNode*>::iterator m_nodePointer;
//	std::list<CTranslateAtomicBlock*>::iterator m_atomicPointer;
	std::list<int> m_listOfInts;
	std::list<CTranslateNode*> m_listOfNodes;
	bool m_IsNotAtEnd;
};
