#pragma once


// COptionsWindow dialog
#include "resource.h"
#include "afxwin.h"

class COptionsWindow : public CDialog
{
	DECLARE_DYNAMIC(COptionsWindow)

public:
	COptionsWindow(CWnd* pParent = NULL);   // standard constructor
	virtual ~COptionsWindow();

// Dialog Data
	enum { IDD = IDD_SALOPTIONS };

protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support

	DECLARE_MESSAGE_MAP()

public:
	afx_msg void OnBnClickedOk();
	int GetOptions();
	int GetBufOption();
	bool GetViewOption();
	bool UseRandomBT();
	bool DisplayTimes();
	void SetOptions(int iTranslateOption, int iBufOption, bool bUsingViews, bool bUsingRandomBT, bool bShowTimes, CString strPathName, CString strFileName, CString strPathName2, CString strFileName2, CString strCriterion);
	CString GetIterations();
public:
	CButton m_cMainRadioButton1;
	CButton m_cMainRadioButton2;
	CButton m_cMainRadioButton3;
	CButton m_cMainRadioButton4;
	int m_iOptionSelected;
	int m_iBufOptionSelected;
	bool m_bViewOptionSelected;
public:
	CButton m_cCheck1;  // Whether or not views should be used.
public:
	// Whether or not to use a randomly generated BT.
	CButton m_cCheck2;
	bool m_bUseRandomBT;
public:
	// Whether or not to display times.
	CButton m_cCheck3;
	bool m_bShowTimes;
public:
	CEdit m_cIterationsBox;
	CEdit m_cIterationsBox2;
	CString m_strIterations;
	CString m_strFileName;
	CString m_strPathName;
	CString m_strFileName2;
	CString m_strPathName2;
	CString m_strTempFileName;
	CString m_strTempPathName;
	CString m_strTempFileName2;
	CString m_strTempPathName2;
	CString m_strCriterion;
public:
	afx_msg void OnBnClickedSalCheck2();
public:
	afx_msg void OnBnClickedSalradio1();
	afx_msg void OnBnClickedButton1();
	afx_msg void OnEnChangeEdit2();
	CEdit m_cInitFileButton;  // This is the edit box next to the "Select Initialisation File" button.
	afx_msg void OnBnClickedButton2();
	CEdit m_cSlicingBox;
	afx_msg void OnEnChangeEdit3();
};
