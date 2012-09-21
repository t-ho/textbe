#pragma once
#include "afxwin.h"
#include "SALTranslator.h"
#include "TranslateSALMain.h"

// CResultsWindow dialog

class CResultsWindow : public CDialog
{
	DECLARE_DYNAMIC(CResultsWindow)

public:
	CResultsWindow(CWnd* pParent = NULL);   // standard constructor
	virtual ~CResultsWindow();

// Dialog Data
	enum { IDD = IDD_SALRESULTS };

private:
	CString m_strResults;
	CString m_strExtension;
	CString m_strCaption;
	CString m_strParsingTime;
	CString m_strTranslationTime;
	CString m_strNumberOfNodes;
	CString m_strNumberOfBranches;
	CString m_strNumberOfReversions;
	CString m_strNumberOfMacros;
	CString m_strNumberOfThreadKills;
	int m_iTranslationType;

protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	virtual BOOL OnInitDialog();

	DECLARE_MESSAGE_MAP()

public:
	CEdit m_cEditResultsBox;
	void SetResultsText(CString strResults);
public:
	afx_msg void OnBnClickedButton1();
public:
	afx_msg void OnBnClickedOk();
public:
	afx_msg void OnBnClickedSalfilebutton();
	void SetDlgCaption(CString strCaption);
	void SetFileExtension(CString strExtension);
	void SetTranslationType(int iType);
	void SetTimes(CString strParsing, CString strTranslation);
	void SetRandomInformation(CString strNodes, CString strBranches, CString strReversions, CString strMacros, CString strThreadKills);
public:
	afx_msg void OnBnClickedSaltimesbutton();
public:
	CEdit m_cParsingEditBox;
public:
	CEdit m_cTranslationEditBox;
public:
	CEdit m_cRandom1;
public:
	CEdit m_cRandom2;
public:
	CEdit m_cRandom3;
public:
	CEdit m_cRandom4;
public:
	CEdit m_cRandom5;

};
