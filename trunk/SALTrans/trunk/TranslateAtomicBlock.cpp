// File name: TranslateAtomicBlock.cpp
// Author/s : Nisansala Yatapanage
// Date built: 19/7/2006
// Last updated: 19/7/2006
// Purpose: This class stores information about a group of atomic nodes.
// Algorithms used:
// Description of Algorithm#:
//
//

#include "StdAfx.h"
#include "TranslateAtomicBlock.h"
#include <tchar.h>
//#ifdef _DEBUG
//#define new DEBUG_NEW
//#endif

CTranslateAtomicBlock::CTranslateAtomicBlock(void)
{
	m_plProgramCounters = new NList<int, int>;
	m_bContainsExternal = false;
	m_bContainsInternal = false;
}

CTranslateAtomicBlock::~CTranslateAtomicBlock(void)
{
	delete m_plProgramCounters;
}

NList<int, int>* CTranslateAtomicBlock::GetNodes()
{
	return &m_lNodes;
}

int CTranslateAtomicBlock::GetTopNode(void)
{
	return m_lNodes.GetHead();
}

int CTranslateAtomicBlock::GetBottomNode(void)
{
	return m_lNodes.GetTail();
}

bool CTranslateAtomicBlock::ContainsNode(int iNode)
{
int s = m_lNodes.GetHead();
	NPosition cPosition = m_lNodes.Find(iNode);
	if (!cPosition.IsNotNull()){
		return false;
	}else{
		return true;
	}
}

void CTranslateAtomicBlock::AddNodeBelow(int iNode)
{
	m_lNodes.AddTail(iNode);
}

void CTranslateAtomicBlock::AddNodeAbove(int iNode)
{
	m_lNodes.AddHead(iNode);
}

void CTranslateAtomicBlock::SetExternal(void)
{
	m_bContainsExternal = true;
}

bool CTranslateAtomicBlock::ContainsExternal(void)
{
	return m_bContainsExternal;
}

void CTranslateAtomicBlock::SetInternalInput(void)
{
	m_bContainsInternal = true;
}

bool CTranslateAtomicBlock::ContainsInternalInput(void)
{
	return m_bContainsInternal;
}

void CTranslateAtomicBlock::AddNewProgramCounter(int iPC){
	m_plProgramCounters->AddTail(iPC);
}

NList<int,int>* CTranslateAtomicBlock::GetProgramCounters(void){
	return m_plProgramCounters;
}
void CTranslateAtomicBlock::SortIntoViews(void)
{
	// To be completed.
}

// View methods to be completed.
