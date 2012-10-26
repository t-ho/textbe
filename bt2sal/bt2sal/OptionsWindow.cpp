// OptionsWindow.cpp : implementation file
//

#include "stdafx.h"
#include "SALTranslator.h"
#include "OptionsWindow.h"
#ifdef _DEBUG
#define new DEBUG_NEW
#endif

// COptionsWindow dialog

IMPLEMENT_DYNAMIC(COptionsWindow, CDialog)

COptionsWindow::COptionsWindow(CWnd* pParent /*=NULL*/)
	: CDialog(COptionsWindow::IDD, pParent)
{

}

COptionsWindow::~COptionsWindow()
{
}

void COptionsWindow::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);

	DDX_Control(pDX, IDC_SALRADIO1, m_cMainRadioButton1);
	DDX_Control(pDX, IDC_SALRADIO4, m_cMainRadioButton4);
	DDX_Control(pDX, IDC_SALRADIO2, m_cMainRadioButton2);
	DDX_Control(pDX, IDC_SALRADIO3, m_cMainRadioButton3);
	DDX_Control(pDX, IDC_SAL_CHECK1, m_cCheck1);
	DDX_Control(pDX, IDC_SAL_CHECK2, m_cCheck2);
	DDX_Control(pDX, IDC_SAL_CHECK3, m_cCheck3);
	DDX_Control(pDX, IDC_EDIT1, m_cIterationsBox);
	DDX_Control(pDX, IDC_EDIT2, m_cInitFileButton);
	DDX_Control(pDX, IDC_EDIT3, m_cSlicingBox);

	// Initialise the buttons.
	// Clear all the radio buttons.
	m_cMainRadioButton1.SetCheck(BST_UNCHECKED);
	m_cMainRadioButton4.SetCheck(BST_UNCHECKED);
	m_cMainRadioButton2.SetCheck(BST_UNCHECKED);
	m_cMainRadioButton3.SetCheck(BST_UNCHECKED);

	// Set the right radio buttons.
	if (m_iOptionSelected == 1){
		m_cMainRadioButton1.SetCheck(BST_CHECKED);
	}else if (m_iOptionSelected == 4){
		m_cMainRadioButton4.SetCheck(BST_CHECKED);
	}
	if (m_iBufOptionSelected == 1){
		m_cMainRadioButton2.SetCheck(BST_CHECKED);
	}else if (m_iBufOptionSelected == 2){
		m_cMainRadioButton3.SetCheck(BST_CHECKED);
	}

	// Set the right checkboxes.
	if (m_bViewOptionSelected){
		m_cCheck1.SetCheck(BST_CHECKED);
	}else{
		m_cCheck1.SetCheck(BST_UNCHECKED);
	}

	if (m_bUseRandomBT){
		m_cCheck2.SetCheck(BST_CHECKED);

	}else{
		m_cCheck2.SetCheck(BST_UNCHECKED);
	}

	if (m_bShowTimes){
		m_cCheck3.SetCheck(BST_CHECKED);
	}else{
		m_cCheck3.SetCheck(BST_UNCHECKED);
	}
	//	m_cIterationsBox.SetWindowTextW(m_strIterations);
	//if (m_bUseRandomBT){
	m_cIterationsBox.EnableWindow(1);
	//m_cSlicingBox.EnableWindow(1);
	m_cIterationsBox.SetWindowTextW(m_strPathName);
	m_cInitFileButton.SetWindowTextW(m_strPathName2);
	m_cSlicingBox.SetWindowTextW(m_strCriterion);
	//	}else{
	//	m_cIterationsBox.EnableWindow(0);
	//	}

	
}


BEGIN_MESSAGE_MAP(COptionsWindow, CDialog)
	ON_BN_CLICKED(IDOK, &COptionsWindow::OnBnClickedOk)
	ON_BN_CLICKED(IDC_SAL_CHECK2, &COptionsWindow::OnBnClickedSalCheck2)
	ON_BN_CLICKED(IDC_SALRADIO1, &COptionsWindow::OnBnClickedSalradio1)
	ON_BN_CLICKED(IDC_BUTTON1, &COptionsWindow::OnBnClickedButton1)
	ON_BN_CLICKED(IDC_BUTTON2, &COptionsWindow::OnBnClickedButton2)
	ON_EN_CHANGE(IDC_EDIT3, &COptionsWindow::OnEnChangeEdit3)
END_MESSAGE_MAP()


// COptionsWindow message handlers
void COptionsWindow::OnBnClickedOk()
{
	int iRadioValue = m_cMainRadioButton1.GetCheck();
	
	if (iRadioValue == 1){
		m_iOptionSelected = 1;
	}else{
		iRadioValue = m_cMainRadioButton4.GetCheck();
		if (iRadioValue == 1){
			m_iOptionSelected = 4;
		}
	}
	int iRadioValue2 = m_cMainRadioButton2.GetCheck();
	
	if (iRadioValue2 == 1){
		m_iBufOptionSelected = 1;
	}else{
		iRadioValue2 = m_cMainRadioButton3.GetCheck();
		if (iRadioValue2 == 1){
			m_iBufOptionSelected = 2;
		}
	}
	int iOption = m_cCheck1.GetCheck();
	if (iOption == BST_CHECKED){
		m_bViewOptionSelected = true;
	}else{
		m_bViewOptionSelected = false;
	}
	
	int iOption2 = m_cCheck2.GetCheck();
	if (iOption2 == BST_CHECKED){
		m_bUseRandomBT = true;
	}else{
		m_bUseRandomBT = false;
	}

	int iOption3 = m_cCheck3.GetCheck();
	if (iOption3 == BST_CHECKED){
		m_bShowTimes = true;
	}else{
		m_bShowTimes = false;
	}

	m_strPathName = m_strTempPathName;
	m_strFileName = m_strTempFileName;
	m_strPathName2 = m_strTempPathName2;
	m_strFileName2 = m_strTempFileName2;
	m_cSlicingBox.GetWindowTextW(m_strCriterion);
	
//	m_cIterationsBox.GetWindowTextW(m_st);
	OnOK();
}

int COptionsWindow::GetOptions()
{
	return m_iOptionSelected;
}

int COptionsWindow::GetBufOption()
{
	return m_iBufOptionSelected;
}

bool COptionsWindow::GetViewOption()
{
	return m_bViewOptionSelected;
}

bool COptionsWindow::UseRandomBT()
{
	return m_bUseRandomBT;
}

bool COptionsWindow::DisplayTimes()
{
	return m_bShowTimes;
} 

void COptionsWindow::SetOptions(int iTranslateOption, int iBufOption, bool bUsingViews, bool bUsingRandomBT, bool bShowTimes, CString strPathName, CString strFileName, CString strPathName2, CString strFileName2, CString strCriterion){
	m_iOptionSelected = iTranslateOption;
	m_iBufOptionSelected = iBufOption;
	m_bViewOptionSelected = bUsingViews;
	m_bUseRandomBT = bUsingRandomBT;
	m_bShowTimes = bShowTimes;
	m_strPathName = strPathName;
	m_strFileName = strFileName;
	m_strPathName2 = strPathName2;
	m_strFileName2 = strFileName2;
	m_strTempPathName = m_strPathName;
	m_strTempPathName2 = m_strPathName2;
	m_strTempFileName = m_strFileName;
	m_strTempFileName2 = m_strFileName2;
	m_strCriterion = strCriterion;
}

CString COptionsWindow::GetIterations(){
	return m_strIterations;
}
void COptionsWindow::OnBnClickedSalCheck2()
{
	int iOption2 = m_cCheck2.GetCheck();
//	if (iOption2 == BST_CHECKED){
//		m_cIterationsBox.EnableWindow(1);
//	}else{
//		m_cIterationsBox.EnableWindow(0);
//	}
}

void COptionsWindow::OnBnClickedSalradio1()
{
	// TODO: Add your control notification handler code here
}


void COptionsWindow::OnBnClickedButton1()
{
	// Show a file dialog to select the file.
	CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
					OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
	CString strPathName;
	CString strFileName;
	if(cFileDlg.DoModal ()==IDOK ){
		strPathName = cFileDlg.GetPathName();
		strFileName = cFileDlg.GetFileName();
	}
	m_cIterationsBox.SetWindowTextW(strPathName);
	m_strTempPathName = strPathName;
	m_strTempFileName = strFileName;

}


void COptionsWindow::OnBnClickedButton2()
{
	// Show a file dialog to select the file.
	CFileDialog cFileDlg (TRUE, NULL, _T("*.*"),
					OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, NULL, NULL);
	CString strPathName;
	CString strFileName;
	if(cFileDlg.DoModal ()==IDOK ){
		strPathName = cFileDlg.GetPathName();
		strFileName = cFileDlg.GetFileName();
	}
	m_cInitFileButton.SetWindowTextW(strPathName);
	m_strTempPathName2 = strPathName;
	m_strTempFileName2 = strFileName;
}


void COptionsWindow::OnEnChangeEdit3()
{
	// TODO:  If this is a RICHEDIT control, the control will not
	// send this notification unless you override the CDialog::OnInitDialog()
	// function and call CRichEditCtrl().SetEventMask()
	// with the ENM_CHANGE flag ORed into the mask.

	// TODO:  Add your control notification handler code here
}
