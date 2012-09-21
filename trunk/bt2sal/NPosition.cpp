#include "StdAfx.h"
#include "NPosition.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

NPosition::NPosition(void)
{

}

NPosition::~NPosition(void)
{

}

void NPosition::SetPointer(std::list<int> &intList){
//	m_intPointer = intPointer;
//	m_listOfInts = intList;
	m_iType = 1;
	m_intPointer = intList.begin();
	m_IsNotAtEnd = true;
}

void NPosition::SetPointer(std::list<CTranslateNode*> &nodeList){
	m_iType = 2;
	m_nodePointer = nodeList.begin();
	m_IsNotAtEnd = true;
}
//	void SetPointer(std::list<CTranslateAtomicBlock*>::iterator atomicPointer);
std::list<int>::iterator NPosition::GetPointer(int iType){
	return m_intPointer;
}

std::list<CTranslateNode*>::iterator NPosition::GetPointer(CTranslateNode* pcType){
	return m_nodePointer;
}

bool NPosition::IsNotNull(){
	return m_IsNotAtEnd;	
}
//	std::list<CTranslateAtomicBlock*>::iterator GetPointer(CTranslateAtomicBlock* pcType);
void NPosition::SetIsNull(){
	m_IsNotAtEnd = false;
}

void NPosition::IncrementPointer(){
	if (m_iType == 1){
		m_intPointer++;
	}else if (m_iType == 2){
		m_nodePointer++;
	}
}