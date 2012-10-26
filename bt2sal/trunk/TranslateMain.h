// File name: TranslateMain.h
// Author/s : Nisansala Yatapanage
// Date built: 17/10/2006
// Last updated: 17/10/2006
// Purpose: Abstract main translation class. 
//
// Algorithms used:
// Description of Algorithm#:
//

#pragma once
#include "TranslateAtomicBlock.h"

class CTranslateMain : public CObject
{
public:
	CTranslateMain(void);
public:
	virtual ~CTranslateMain(void);
public:
	virtual void SelectOptions(void);
public:
	virtual void ParseBT(int iTreeID);
public:
	virtual void AddInputVariable(CString strName);
	virtual void AddOutputVariable(CString strName);
	virtual void AddLocalBoolean(CString strName);
	virtual void AddIntegerAttribute(CString strName);
	virtual void AddLocalVariable(CString strName, CString strState);
	virtual void AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes);
	virtual NList<int, int>* GetInternalMsgAssociation(int iOutputNode);
	virtual int FindListPosition(NList<CString, CString>& cList, CString strValue);
	virtual void RemoveFromList(NList<CString, CString>& cList, int iIndex);
	virtual void AddNodeGuard(int iNode, CString strGuard);
	virtual void AddNodeAction(int iNode, NList<CString, CString>* plActions);
	virtual void RemoveNodeTransition(int iNode);
	virtual void AddExtraNodeAction(int iNode, CString strAction);
	virtual int AddExtraTransition(CString strGuard, NList<CString,CString>* plActions);
	virtual void AddPCRange(int iProgramCounter, int iValue);
	virtual CString GetNewProgramCounter();
	virtual CString GetPCForNode(int iNode);
	virtual int GetPCValueForNode(int iNode);
	virtual CString GetGuard(int iNode);
	virtual NList<CString, CString>* GetActions(int iNode);
	virtual NList<CString, CString>* FindThreadsToKill(int iNode);
	virtual void AddAtomicGuard(int iNode, CString strGuard);
	virtual void AddAtomicActions(int iNode, NList<CString, CString>* plActions);
	virtual CString GetAtomicGuard(int iNode);
	virtual NList<CString, CString>* GetAtomicActions(int iNode);
	virtual void CreateIDValues(int iRootNode);
	virtual CString TrimChangeCase(CString strName, bool bToUpperCase);
	virtual bool IsAtomic(int iNode);
	virtual int GetTranslationType();
	virtual bool UsingViews();
	virtual void RemoveAssignmentRepeats(NList<CString, CString>& lAssignments);
	virtual void RemoveMessageConflicts(NList<CString, CString>& lUpdates, NList<CString, CString>& lMessageNames);
	virtual void AddMessageString(CString strMessage);
	virtual void TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes);
	virtual void StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules);
	NList<CString, CString>* ConvertGuardToList(CString strGuard);

};
