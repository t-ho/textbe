// File name: TranslateUTrans.cpp
// Author/s : Nisansala Yatapanage
// Date built: 5/6/2007
// Last updated: 19/6/2007
// Purpose: This class represents a transition in an UPPAAL model.
//
// Algorithms used:
// Description of Algorithm#:
//

#include "StdAfx.h"
#include "TranslateUTrans.h"
#include "TranslateException.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

CTranslateUTrans::CTranslateUTrans(void)
{
	m_bIsJumpNode = false;
	m_bIsCommitted = false;
	m_strGuard = _T("");
	m_strAssignment = _T("");
	m_strSynchronisation = _T("");
}

CTranslateUTrans::~CTranslateUTrans(void)
{
}

// Get the pc for the source location.
// e.g. for location pc6state7 it returns 6.
int CTranslateUTrans::GetSourcePC(void)
{
	return m_iSourcePC;
}

// Get the pc value for the source location.
// e.g. for location pc6state4 it returns 4.
int CTranslateUTrans::GetSourcePCValue(void)
{
	return m_iSourcePCValue;
}

// Get the index of the source location.
// e.g. for location pc4state5_6 it returns 6;
// for location pc9state4 it returns 0.
int CTranslateUTrans::GetSourceIndex(void){
	return m_iSourceIndex;
}

// Get the pc for the target location.
// e.g. for location pc6state7 it returns 6.
int CTranslateUTrans::GetTargetPC(void)
{
	return m_iTargetPC;
}

// Get the pc value for the target location.
// e.g. for location pc5state4 it returns 4.
int CTranslateUTrans::GetTargetPCValue(void)
{
	return m_iTargetPCValue;
}

// Get the index of the target location.
// e.g. for location pc4state5_6 it returns 6;
// for location pc9state4 it returns 0.
int CTranslateUTrans::GetTargetIndex(void){
	return m_iTargetIndex;
}

CString CTranslateUTrans::GetAssignment(){
	return m_strAssignment;
}

CString CTranslateUTrans::GetGuard(){
	return m_strGuard;
}

CString CTranslateUTrans::GetSynchronisation(){
	return m_strSynchronisation;
}

// Set the source location of this transition.
// Parameters:  iPC  -  The program counter of the source location,
//				iValue - The program counter's value at the source location.
//				iIndex - The index of the source location, 0 if none exists.
//				(e.g. for location pc6state5_4, use SetSource(6,5,4);
//				  for location pc7state2 use SetSource(7,2,0).
void CTranslateUTrans::SetSource(int iPC, int iValue, int iIndex){
	m_iSourcePC = iPC;
	m_iSourcePCValue = iValue;
	m_iSourceIndex = iIndex;
}

// Set the target location of this transition.
// Parameters:  iPC  -  The program counter of the target location,
//				iValue - The program counter's value at the target location.
//				iIndex - The index of the target location, 0 if none exists.
//				(e.g. for location pc6state5_4, use SetTarget(6,5,4);
//				  for location pc7state2 use SetTarget(7,2,0).
void CTranslateUTrans::SetTarget(int iPC, int iValue, int iIndex){
	m_iTargetPC = iPC;
	m_iTargetPCValue = iValue;
	m_iTargetIndex = iIndex;
}

// Add a label to this transition.
// Parameters: strLabel - The string label,
//				iType  -  The label type, e.g. UPPAAL_GUARD.
void CTranslateUTrans::AddLabel(CString strLabel, int iType){
	if (iType == 2){ // This is a guard.
		// There can only be one guard per transition, so check if one is already there.
		if ((m_strGuard != _T("")) && (m_strGuard != strLabel)){
			// One already exists so throw an exception.
			CString strMessage = _T("Error: There cannot be more than 1 UPPAAL guard per transition.");
			strMessage.Append(_T("\nAn atomic block exists which contains >1 BT selection or guard."));
			strMessage.Append(_T("\nThe block involves the following UPPAAL guard:"));
			strMessage.Append(strLabel);
			CTranslateException cException(strMessage);
			throw cException;
		}else{
			m_strGuard = strLabel;
		}
	}else if (iType == 3){  // This is a synchronisation.
		// There can only be one synchronisation per transition, so check if one is already there.
		if ((m_strSynchronisation != _T("")) && (m_strSynchronisation != strLabel)){
			// One already exists so throw an exception.
			CString strMessage = _T("Error: There cannot be more than 1 synchronisation per transition.");
			strMessage.Append(_T("\nAn atomic block exists which contains >1 BT events \nor one event with multiple receivers."));
			strMessage.Append(_T("\nThe block involves the following UPPAAL guard:"));
			strMessage.Append(strLabel);
			CTranslateException cException(strMessage);
			throw cException;
		}else{
			m_strSynchronisation = strLabel;
		}
	}else if (iType == 1){ // This is an assignment.
		if ((m_strAssignment != _T("")) && (m_strAssignment != strLabel)){ // An assignment already exists so append this one to it.
			m_strAssignment.Append(_T(", "));
			m_strAssignment.Append(strLabel);
		}else{  // No assignment already exists.
			m_strAssignment = strLabel;
		}
	}
}

// Set whether or not the target location should be committed.
void CTranslateUTrans::SetIsCommitted(bool bCommitted){
	m_bIsCommitted = bCommitted;
}

// Returns true if the target location should be committed, false otherwise.
bool CTranslateUTrans::IsCommitted(){
	return m_bIsCommitted;
}

// Set whether or not this is a "jump" transition.
// That is, it is not a normal transition between two locations, instead
// it may be a transition from a location back to the disabled state or
// a transition from the disabled state to some location or
// a transition between two locations due to a reversion or macro, where the
// locations may or may not be next to each other.
void CTranslateUTrans::SetIsJumpNode(bool bIsJump){
	m_bIsJumpNode = bIsJump;
}

// Returns true if this transition is a "jump" transition, false otherwise.
// That is, it is not a normal transition between two locations, instead
// it may be a transition from a location back to the disabled state or
// a transition from the disabled state to some location or
// a transition between two locations due to a reversion or macro, where the
// locations may or may not be next to each other.
bool CTranslateUTrans::IsJumpNode(){
	return m_bIsJumpNode;
}

// Sets the invariant for the target location of this transition.
// Parameters:  strInvariant - The string invariant.
void CTranslateUTrans::SetInvariant(CString strInvariant){
	m_strInvariant = strInvariant;
}

// Gets the invariant for the target location of this transition.
CString CTranslateUTrans::GetInvariant(){
	return m_strInvariant;
}
