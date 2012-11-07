
#include "NPosition.h"



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
	if (m_intPointer == intList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}

void NPosition::SetPointer(std::list<CTranslateNode*> &nodeList){
	m_iType = 2;
	m_nodePointer = nodeList.begin();
	if (m_nodePointer == nodeList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}

void NPosition::SetPointer(std::list<CTranslateStep*> &stepList){
	m_iType = 3;
	m_stepPointer = stepList.begin();
	if (m_stepPointer == stepList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}

void NPosition::SetPointer(std::list<CTranslateParsingRule*> &ruleList){
	m_iType = 4;
	m_rulePointer = ruleList.begin();
	if (m_rulePointer == ruleList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}

void NPosition::SetPointer(std::list<CTranslateAtomicBlock*> &blockList){
	m_iType = 5;
	m_blockPointer = blockList.begin();
	if (m_blockPointer == blockList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}

void NPosition::SetPointer(std::list<NString> &stringList){
	m_iType = 6;
	m_stringPointer = stringList.begin();
	if (m_stringPointer == stringList.end()){ // This would happen if the list is empty.
		m_IsNotAtEnd = false;
	}else{
		m_IsNotAtEnd = true;
	}
}
//	void SetPointer(std::list<CTranslateAtomicBlock*>::iterator atomicPointer);
std::list<int>::iterator NPosition::GetPointer(int iType){
	return m_intPointer;
}

std::list<CTranslateNode*>::iterator NPosition::GetPointer(CTranslateNode* pcType){
	return m_nodePointer;
}

std::list<NString>::iterator NPosition::GetPointer(NString strType){
	return m_stringPointer;
}

std::list<CTranslateStep*>::iterator NPosition::GetPointer(CTranslateStep* pcType){
	return m_stepPointer;
}

std::list<CTranslateParsingRule*>::iterator NPosition::GetPointer(CTranslateParsingRule* pcType){
	return m_rulePointer;
}

std::list<CTranslateAtomicBlock*>::iterator NPosition::GetPointer(CTranslateAtomicBlock* pcType){
	return m_blockPointer;
}

bool NPosition::IsNotNull(){
	return m_IsNotAtEnd;	
}

bool NPosition::IsNull(){
	if (m_IsNotAtEnd == true){
		return false;
	}else{
		return true;
	}
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
	}else if (m_iType == 3){
		m_stepPointer++;
	}else if (m_iType == 4){
		m_rulePointer++;
	}else if (m_iType == 5){
		m_blockPointer++;
	}else if (m_iType == 6){
		m_stringPointer++;
	}
}

void NPosition::IncrementMapPointer(){
	if (m_iType == 7){
		m_intMapPointer++;
	}else if (m_iType == 8){
		m_stringMapPointer++;
	}else if (m_iType == 9){
		m_intListMapPointer++;
	}else if (m_iType == 10){
		m_stringListMapPointer++;
	}else if (m_iType == 11){
		m_nodeMapPointer++;
	}else if (m_iType == 12){
		m_blockMapPointer++;
	}
}

void NPosition::SetMapPointer(std::map<int,int> &intMap){
	m_intMapPointer = intMap.begin();
	m_iType = 7;
}
void NPosition::SetMapPointer(std::map<int,NString> &stringMap){
	m_stringMapPointer = stringMap.begin();
	m_iType = 8;
}
void NPosition::SetMapPointer(std::map<int,NList<int, int>*> &intListMap){
	m_intListMapPointer = intListMap.begin();
	m_iType = 9;
}
void NPosition::SetMapPointer(std::map<int,NList<NString, NString>*> &stringListMap){
	m_stringListMapPointer = stringListMap.begin();
	m_iType = 10;
}
void NPosition::SetMapPointer(std::map<int,CTranslateNode*> &nodeMap){
	m_nodeMapPointer = nodeMap.begin();
	m_iType = 11;
}
void NPosition::SetMapPointer(std::map<int,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*> &blockMap){
	m_blockMapPointer = blockMap.begin();
	m_iType = 12;
}

std::map<int,int>::iterator NPosition::GetMapPointer(int iType,int iType2){
	return m_intMapPointer;
}

std::map<int,NString>::iterator NPosition::GetMapPointer(int iType,NString strType2){
	return m_stringMapPointer;
}

std::map<int,NList<int, int>*>::iterator NPosition::GetMapPointer(int iType,NList<int, int>* pcType2){
	return m_intListMapPointer;
}

std::map<int,NList<NString, NString>*>::iterator NPosition::GetMapPointer(int iType,NList<NString, NString>* pcType2){
	return m_stringListMapPointer;
}

std::map<int,CTranslateNode*>::iterator NPosition::GetMapPointer(int iType,CTranslateNode* pcType2){
	return m_nodeMapPointer;
}

std::map<int,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*>::iterator NPosition::GetMapPointer(int iType,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>* pcType2){
	return m_blockMapPointer;
}
