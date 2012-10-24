// File name: TranslateException.h
// Author/s : Nisansala Yatapanage
// Date built: 21/7/2006
// Last updated: 21/7/2006
// Purpose: This class is represents an exception that can be thrown
//			by the rule classes during parsing.
// Algorithms used:
// Description of Algorithm#:
//
//

#pragma once
#include "NString.h"
#include <tchar.h>

class CTranslateException
{
public:
	CTranslateException(void);
	CTranslateException(NString strMessage);
public:
	~CTranslateException(void);
public:
	NString GetMessage(void);
public:
	NString m_strMessage;
};
