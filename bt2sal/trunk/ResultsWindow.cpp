// ResultsWindow.cpp : implementation file
//

#include "stdafx.h"
#include "ResultsWindow.h"
#ifdef _DEBUG
#define new DEBUG_NEW
#endif

// CResultsWindow dialog

IMPLEMENT_DYNAMIC(CResultsWindow, CDialog)

CResultsWindow::CResultsWindow(CWnd* pParent /*=NULL*/)
	: CDialog(CResultsWindow::IDD, pParent)
{
	m_strExtension = _T("sal");   // Default.
	m_strCaption = _T("SAL Translation");  // Default.
	m_iTranslationType = 1; // Default is SAL translation.
}

CResultsWindow::~CResultsWindow()
{
}

void CResultsWindow::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	DDX_Control(pDX, IDC_EDITRESULTS, m_cEditResultsBox);	
	DDX_Control(pDX, IDC_SAL_PARSINGBOX, m_cParsingEditBox);
	DDX_Control(pDX, IDC_SAL_TRANSLATINGBOX, m_cTranslationEditBox);
	DDX_Control(pDX, IDC_SAL_RANDOMBOX1, m_cRandom1);
	DDX_Control(pDX, IDC_SAL_RANDOMBOX2, m_cRandom2);
	DDX_Control(pDX, IDC_SAL_RANDOMBOX3, m_cRandom3);
	DDX_Control(pDX, IDC_SAL_RANDOMBOX4, m_cRandom4);
	DDX_Control(pDX, IDC_SAL_RANDOMBOX5, m_cRandom5);
}


BEGIN_MESSAGE_MAP(CResultsWindow, CDialog)
	ON_BN_CLICKED(IDOK, &CResultsWindow::OnBnClickedOk)
	ON_BN_CLICKED(IDC_SALFILEBUTTON, &CResultsWindow::OnBnClickedSalfilebutton)
	ON_BN_CLICKED(IDC_SALTIMESBUTTON, &CResultsWindow::OnBnClickedSaltimesbutton)
END_MESSAGE_MAP()

BOOL CResultsWindow::OnInitDialog()
{
	CDialog::OnInitDialog();
	CenterWindow();
	SetWindowPos(&CWnd::wndTopMost,0,0,0,0,SWP_NOMOVE|SWP_NOSIZE);
	m_cEditResultsBox.SetWindowText(m_strResults);
	m_cParsingEditBox.SetWindowTextW(m_strParsingTime);
	m_cTranslationEditBox.SetWindowTextW(m_strTranslationTime);
	m_cRandom1.SetWindowTextW(m_strNumberOfNodes);
	m_cRandom2.SetWindowTextW(m_strNumberOfBranches);
	m_cRandom3.SetWindowTextW(m_strNumberOfReversions);
	m_cRandom4.SetWindowTextW(m_strNumberOfMacros);
	m_cRandom5.SetWindowTextW(m_strNumberOfThreadKills);
	
	return TRUE;  // return true unless you set the focus to a control
	// EXCEPTION: OCX Property Pages should return false
}

void CResultsWindow::SetResultsText(CString strResults)
{
	m_strResults = strResults;
}
// CResultsWindow message handlers
void CResultsWindow::OnBnClickedOk()
{
	OnOK();
}

void CResultsWindow::OnBnClickedSalfilebutton()
{
	// Show a file dialog box.
	CString strFilter;
	strFilter = m_strExtension + _T(" File (*.") + m_strExtension + _T(")|*.") 
		+ m_strExtension + _T("|All Files (*.*)|*.*||");
	CFileDialog cFileDlg (FALSE, m_strExtension, _T("*.") + m_strExtension,
		OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, (LPCTSTR) strFilter, NULL);
   
	if( cFileDlg.DoModal ()==IDOK )
	{
		CString strPathName = cFileDlg.GetPathName();
		CString strFileName = cFileDlg.GetFileName();
			
		// Get what's currently in the results window, as the user may have changed it.
		m_cEditResultsBox.GetWindowTextW(m_strResults);

		if (m_iTranslationType == 1){
			// Replace the first part of the results with the new file name.
			int iIndex = m_strResults.Find(_T(":CONTEXT"));
			m_strResults.Delete(0,iIndex);
			strFileName.Replace(_T(".") + m_strExtension,_T(""));
			m_strResults = strFileName + m_strResults;
		}

		// Save the results to the specified file.
		FILE *pcFile;
		_tfopen_s(&pcFile,(LPCTSTR)strPathName,_T("wt"));
		_fputts((LPCTSTR)m_strResults ,pcFile);
		fclose(pcFile);
	}

}
// Set the caption of this dialog.
void CResultsWindow::SetDlgCaption(CString strCaption){
	m_strCaption = strCaption;
}

// Set the default file extension to save to.
void CResultsWindow::SetFileExtension(CString strExtension){
	m_strExtension = strExtension;
}

void CResultsWindow::SetTranslationType(int iType){
	m_iTranslationType = iType;
}
void CResultsWindow::OnBnClickedSaltimesbutton()
{
	// Show a file dialog box.
	CString strFilter;
	strFilter = _T(" File (*.*)|*.*|");
	CFileDialog cFileDlg (FALSE, _T("*.*"), _T("*.*"),
		OFN_OVERWRITEPROMPT | OFN_HIDEREADONLY, (LPCTSTR) strFilter, NULL);
   
	if( cFileDlg.DoModal ()==IDOK )
	{
		CString strPathName = cFileDlg.GetPathName();
		CString strFileName = cFileDlg.GetFileName();

		CString strTimes = _T("Parsing time (ms): ");
		strTimes.Append(m_strParsingTime);
		strTimes.Append(_T("\r\nTranslation time (ms): "));
		strTimes.Append(m_strTranslationTime);

		if (m_strNumberOfNodes != _T("")){
			// Write the information about the randomly generated BT too.
			strTimes.Append(_T("\r\nNumber of Nodes: "));
			strTimes.Append(m_strNumberOfNodes);
			strTimes.Append(_T("\r\nNumber of Branches: "));
			strTimes.Append(m_strNumberOfBranches);
			strTimes.Append(_T("\r\nNumber of Reversions: "));
			strTimes.Append(m_strNumberOfReversions);
			strTimes.Append(_T("\r\nNumber of Macros: "));
			strTimes.Append(m_strNumberOfMacros);
			strTimes.Append(_T("\r\nNumber of Thread Kills: "));
			strTimes.Append(m_strNumberOfThreadKills);
		}

		// Save the results to the specified file.
		FILE *pcFile;
		_tfopen_s(&pcFile,(LPCTSTR)strPathName,_T("wt"));
		_fputts((LPCTSTR)strTimes ,pcFile);
		fclose(pcFile);
	}
}

void CResultsWindow::SetTimes(CString strParsing, CString strTranslation){
	m_strParsingTime = strParsing;
	m_strTranslationTime = strTranslation;
}

void CResultsWindow::SetRandomInformation(CString strNodes, CString strBranches, CString strReversions, CString strMacros, CString strThreadKills){
	m_strNumberOfNodes = strNodes;
	m_strNumberOfBranches = strBranches;
	m_strNumberOfReversions = strReversions;
	m_strNumberOfMacros = strMacros;
	m_strNumberOfThreadKills = strThreadKills;
}	