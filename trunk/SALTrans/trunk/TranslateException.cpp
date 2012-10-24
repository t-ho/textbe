// File name: TranslateException.cpp
// Author/s : Nisansala Yatapanage
// Date built: 21/7/2006
// Last updated: 21/7/2006
// Purpose: This class is represents an exception that can be thrown
//			by the rule classes during parsing.
// Algorithms used:
// Description of Algorithm#:
//
//
#include "StdAfx.h"
#include "TranslateException.h"

CTranslateException::CTranslateException(void)
{
	m_strMessage = _T("");
}

CTranslateException::~CTranslateException(void)
{
}

CTranslateException::CTranslateException(NString strMessage)
{
	m_strMessage = strMessage;
}

NString CTranslateException::GetMessage(void)
{
	return m_strMessage;
}
