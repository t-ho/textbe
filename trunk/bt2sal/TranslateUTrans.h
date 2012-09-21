// File name: TranslateUTrans.cpp
// Author/s : Nisansala Yatapanage
// Date built: 5/6/2007
// Last updated: 19/6/2007
// Purpose: This class represents a transition in an UPPAAL model.
//
// Algorithms used:
// Description of Algorithm#:
//
#pragma once

#define UPPAAL_ASSIGN 1;  // An assignment.
#define UPPAAL_GUARD 2;  // A guard.
#define UPPAAL_SYNCH 3;  // A synchronisation.

class CTranslateUTrans
{
public:
	CTranslateUTrans(void);
public:
	~CTranslateUTrans(void);
private:
	CString m_strGuard;
	CString m_strSynchronisation;
	CString m_strAssignment;
	int m_iSourcePC;
	int m_iSourcePCValue;
	int m_iTargetPC;
	int m_iTargetPCValue;
	bool m_bIsCommitted;
	bool m_bIsJumpNode;
	int m_iTargetIndex;
	int m_iSourceIndex;
	CString m_strInvariant;
	
public:
	int GetSourcePC(void);
	int GetSourcePCValue(void);
	int GetSourceIndex(void);
public:
	int GetTargetPC(void);
	int GetTargetPCValue(void);
	int GetTargetIndex(void);
public:
	CString GetAssignment(void);
	CString GetSynchronisation(void);
	CString GetGuard(void);
	void SetSource(int iPC, int iValue, int iIndex);
	void SetTarget(int iPC, int iValue, int iIndex);
	void AddLabel(CString strLabel, int iType);
	void SetIsCommitted(bool bCommitted);
	bool IsCommitted(void);
	bool IsJumpNode(void);
	void SetIsJumpNode(bool bIsJump);
	void SetInvariant(CString strInvariant);
	CString GetInvariant(void);
};
