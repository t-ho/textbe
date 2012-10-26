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

class CTranslateException
{
public:
	CTranslateException(void);
	CTranslateException(CString strMessage);
public:
	~CTranslateException(void);
public:
	CString GetMessage(void);
public:
	CString m_strMessage;
};
