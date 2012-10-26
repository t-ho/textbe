#pragma once
#include <list>
#include <map>
//#include "TranslateNode.h"
//#include "TranslateAtomicBlock.h"
class CTranslateNode;
class CTranslateAtomicBlock;
class CTranslateStep;
class CTranslateParsingRule;
template<class SomeType, class AnotherType> class NList;

class NPosition 
{
public:
	NPosition(void);
public:
	~NPosition(void);
public:
	void SetPointer(std::list<int> &intList);
	void SetPointer(std::list<CTranslateNode*> &nodeList);
	void SetPointer(std::list<CTranslateStep*> &stepList);
	void SetPointer(std::list<CTranslateParsingRule*> &ruleList);
	void SetPointer(std::list<CTranslateAtomicBlock*> &blockList);
	void SetPointer(std::list<CString> &nodeList);
	void SetMapPointer(std::map<int,int> &intMap);
	void SetMapPointer(std::map<int,CString> &stringMap);
	void SetMapPointer(std::map<int,NList<int, int>*> &intListMap);
	void SetMapPointer(std::map<int,NList<CString, CString>*> &stringListMap);
	void SetMapPointer(std::map<int,CTranslateNode*> &nodeMap);
	void SetMapPointer(std::map<int,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*> &blockMap);
//	void SetPointer(std::list<CTranslateAtomicBlock*>::iterator atomicPointer);
	std::list<int>::iterator GetPointer(int iType);
	std::list<CString>::iterator GetPointer(CString strType);
	std::list<CTranslateNode*>::iterator GetPointer(CTranslateNode* pcType);
	std::list<CTranslateStep*>::iterator GetPointer(CTranslateStep* pcType);
	std::list<CTranslateParsingRule*>::iterator GetPointer(CTranslateParsingRule* pcType);
	std::list<CTranslateAtomicBlock*>::iterator GetPointer(CTranslateAtomicBlock* pcType);
	std::map<int,int>::iterator GetMapPointer(int iType,int iType2);
	std::map<int,CString>::iterator GetMapPointer(int iType,CString strType2);
	std::map<int,NList<int, int>*>::iterator GetMapPointer(int iType,NList<int, int>* pcType2);
	std::map<int,NList<CString, CString>*>::iterator GetMapPointer(int iType,NList<CString, CString>* pcType2);
	std::map<int,CTranslateNode*>::iterator GetMapPointer(int iType,CTranslateNode* pcType2);
	std::map<int,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*>::iterator GetMapPointer(int iType,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>* pcType2);
	bool IsNotNull();
	bool IsNull();
	void SetIsNull();
	void IncrementPointer();
	void IncrementMapPointer();
//	std::list<CTranslateAtomicBlock*>::iterator GetPointer(CTranslateAtomicBlock* pcType);
		
public:
	int m_iType; 
	std::list<int>::iterator m_intPointer;
	std::list<CString>::iterator m_stringPointer;
	//std::list<CString> m_stringlist;
	std::list<CTranslateNode*>::iterator m_nodePointer;
	std::list<CTranslateStep*>::iterator m_stepPointer;
	std::list<CTranslateParsingRule*>::iterator m_rulePointer;
	std::list<CTranslateAtomicBlock*>::iterator m_blockPointer;
	std::list<int> m_listOfInts;
	std::list<CTranslateNode*> m_listOfNodes;
	bool m_IsNotAtEnd;
	std::map<int,int>::iterator m_intMapPointer;
	std::map<int,CString>::iterator m_stringMapPointer;
	std::map<int,NList<int, int>*>::iterator m_intListMapPointer;
	std::map<int,NList<CString, CString>*>::iterator m_stringListMapPointer;
	std::map<int,CTranslateNode*>::iterator m_nodeMapPointer;
	std::map<int,NList<CTranslateAtomicBlock*, CTranslateAtomicBlock*>*>::iterator m_blockMapPointer;
};
