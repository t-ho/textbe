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
#include "NString.h"


class CTranslateMain
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
	virtual void AddInputVariable(NString strName);
	virtual void AddOutputVariable(NString strName);
	virtual void AddLocalBoolean(NString strName);
	virtual void AddIntegerAttribute(NString strName);
	virtual void AddLocalVariable(NString strName, NString strState);
	virtual void AddInternalMsgAssociation(int iOutputNode, NList<int, int>* plInputNodes);
	virtual NList<int, int>* GetInternalMsgAssociation(int iOutputNode);
	virtual int FindListPosition(NList<NString, NString>& cList, NString strValue);
	virtual void RemoveFromList(NList<NString, NString>& cList, int iIndex);
	virtual void AddNodeGuard(int iNode, NString strGuard);
	virtual void AddNodeAction(int iNode, NList<NString, NString>* plActions);
	virtual void RemoveNodeTransition(int iNode);
	virtual void AddExtraNodeAction(int iNode, NString strAction);
	virtual int AddExtraTransition(NString strGuard, NList<NString,NString>* plActions);
	virtual void AddPCRange(int iProgramCounter, int iValue);
	virtual NString GetNewProgramCounter();
	virtual NString GetPCForNode(int iNode);
	virtual int GetPCValueForNode(int iNode);
	virtual NString GetGuard(int iNode);
	virtual NList<NString, NString>* GetActions(int iNode);
	virtual NList<NString, NString>* FindThreadsToKill(int iNode);
	virtual void AddAtomicGuard(int iNode, NString strGuard);
	virtual void AddAtomicActions(int iNode, NList<NString, NString>* plActions);
	virtual NString GetAtomicGuard(int iNode);
	virtual NList<NString, NString>* GetAtomicActions(int iNode);
	virtual void CreateIDValues(int iRootNode);
	virtual NString TrimChangeCase(NString strName, bool bToUpperCase);
	virtual bool IsAtomic(int iNode);
	virtual int GetTranslationType();
	virtual bool UsingViews();
	virtual void RemoveAssignmentRepeats(NList<NString, NString>& lAssignments);
	virtual void RemoveMessageConflicts(NList<NString, NString>& lUpdates, NList<NString, NString>& lMessageNames);
	virtual void AddMessageString(NString strMessage);
	virtual void TranslateInitNodes(int iRootNode, NList<int, int>& lInitNodes);
	virtual void StoreTranslationStep(int iNode, int iRuleID, int iOtherNode, NList<int, int>* plSecondaryRules);
	NList<NString, NString>* ConvertGuardToList(NString strGuard);

};
