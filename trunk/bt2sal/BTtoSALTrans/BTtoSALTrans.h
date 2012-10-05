// BTtoSALTrans.h : main header file for the BTtoSALTrans DLL
//
#include "TranslateSALMain.h"
#pragma once

#ifndef __AFXWIN_H__
	#error "include 'stdafx.h' before including this file for PCH"
#endif

#include "resource.h"		// main symbols


// CBTtoSALTransApp
// See BTtoSALTrans.cpp for the implementation of this class
//
static CTranslateSALMain m_cTranslateMain;
class __declspec(dllexport) CBTtoSALTransApp : public CWinApp
{
public:
	CBTtoSALTransApp();

// Overrides
public:
	virtual BOOL InitInstance();
	const wchar_t* Translate(int iPriority, int iBuff, int iWithSets, const wchar_t* strSetsPath, const wchar_t* strInitPath);
	DECLARE_MESSAGE_MAP()
};
