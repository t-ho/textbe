// SALTranslator.h : main header file for the SALTranslator application
//
#pragma once

#ifndef __AFXWIN_H__
	#error "include 'stdafx.h' before including this file for PCH"
#endif

#include "resource.h"       // main symbols
#include "TranslateSALMain.h"

// CSALTranslatorApp:
// See SALTranslator.cpp for the implementation of this class
//
static CTranslateSALMain m_cTranslateMain;
class CSALTranslatorApp : public CWinApp
{
public:
	CSALTranslatorApp();


// Overrides
public:
	virtual BOOL InitInstance();

// Implementation
	afx_msg void OnAppAbout();
	DECLARE_MESSAGE_MAP()
public:
	afx_msg void OnTranslateTosal();
public:
	afx_msg void OnTranslateTouppaal();
public:
	afx_msg void OnOptionsSetoptions();
	
};

extern CSALTranslatorApp theApp;