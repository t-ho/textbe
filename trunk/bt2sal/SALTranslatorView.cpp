// SALTranslatorView.cpp : implementation of the CSALTranslatorView class
//

#include "stdafx.h"
#include "SALTranslator.h"

#include "SALTranslatorDoc.h"
#include "SALTranslatorView.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


// CSALTranslatorView

IMPLEMENT_DYNCREATE(CSALTranslatorView, CView)

BEGIN_MESSAGE_MAP(CSALTranslatorView, CView)
	// Standard printing commands
	ON_COMMAND(ID_FILE_PRINT, &CView::OnFilePrint)
	ON_COMMAND(ID_FILE_PRINT_DIRECT, &CView::OnFilePrint)
	ON_COMMAND(ID_FILE_PRINT_PREVIEW, &CView::OnFilePrintPreview)
	ON_COMMAND(ID_TRANSLATE_TOSAL, &CSALTranslatorView::OnTranslateTosal)
	ON_COMMAND(ID_OPTIONS_SETOPTIONS, &CSALTranslatorView::OnOptionsSetoptions)
	ON_COMMAND(ID_TRANSLATE_TOUPPAAL, &CSALTranslatorView::OnTranslateTouppaal)
	ON_COMMAND(ID_HELP_HOWTOUSE, &CSALTranslatorView::OnHelpHowtouse)
	ON_COMMAND(ID_HELP_ERRORMESSAGES, &CSALTranslatorView::OnHelpErrormessages)
	ON_COMMAND(ID_TRANSLATE_TEXTBETOSAL, &CSALTranslatorView::OnTranslateTextbetosal)
	ON_COMMAND(ID_TRANSLATE_TEXTBETOUPPAAL, &CSALTranslatorView::OnTranslateTextbetouppaal)
	ON_EN_CHANGE(IDC_EDIT2, &CSALTranslatorView::OnEnChangeEdit2)
END_MESSAGE_MAP()

// CSALTranslatorView construction/destruction

CSALTranslatorView::CSALTranslatorView()
{
	// TODO: add construction code here

}

CSALTranslatorView::~CSALTranslatorView()
{
}

BOOL CSALTranslatorView::PreCreateWindow(CREATESTRUCT& cs)
{
	// TODO: Modify the Window class or styles here by modifying
	//  the CREATESTRUCT cs

	return CView::PreCreateWindow(cs);
}

// CSALTranslatorView drawing

void CSALTranslatorView::OnDraw(CDC* /*pDC*/)
{
	CSALTranslatorDoc* pDoc = GetDocument();
	ASSERT_VALID(pDoc);
	if (!pDoc)
		return;

	// TODO: add draw code for native data here
}


// CSALTranslatorView printing

BOOL CSALTranslatorView::OnPreparePrinting(CPrintInfo* pInfo)
{
	// default preparation
	return DoPreparePrinting(pInfo);
}

void CSALTranslatorView::OnBeginPrinting(CDC* /*pDC*/, CPrintInfo* /*pInfo*/)
{
	// TODO: add extra initialization before printing
}

void CSALTranslatorView::OnEndPrinting(CDC* /*pDC*/, CPrintInfo* /*pInfo*/)
{
	// TODO: add cleanup after printing
}


// CSALTranslatorView diagnostics

#ifdef _DEBUG
void CSALTranslatorView::AssertValid() const
{
	CView::AssertValid();
}

void CSALTranslatorView::Dump(CDumpContext& dc) const
{
	CView::Dump(dc);
}

CSALTranslatorDoc* CSALTranslatorView::GetDocument() const // non-debug version is inline
{
	ASSERT(m_pDocument->IsKindOf(RUNTIME_CLASS(CSALTranslatorDoc)));
	return (CSALTranslatorDoc*)m_pDocument;
}
#endif //_DEBUG


// CSALTranslatorView message handlers

void CSALTranslatorView::OnTranslateTosal()
{
	// This is the handler for translating from BESE to SAL.
	// Start the SAL translator.
	m_cTranslateMain.ParseBT(0, false, true);
}

void CSALTranslatorView::OnOptionsSetoptions()
{
	m_cTranslateMain.SelectOptions();
}

void CSALTranslatorView::OnTranslateTouppaal()
{
	AfxMessageBox(_T("Sorry, this feature is not yet available in this version of the SAL Translator.\r\nIt is currently only available in the Integrare SAL Translator."));
	////m_cTranslateUPPAAL.ParseBT(iBTId, false, true);
}

void CSALTranslatorView::OnHelpHowtouse()
{
	CString strHowtouse = _T("HOW TO USE \r\n\r\nTo select options select Options->Set Options.");
	strHowtouse.Append(_T("\r\nThe options dialog allows you to choose whether or not prioritisation"));
	strHowtouse.Append(_T("\r\nshould be used. The dialog also allows you to select a randomly generated"));
	strHowtouse.Append(_T(" BT instead of reading a BT from a file."));
	strHowtouse.Append(_T("\r\n\r\nTo translate, select Translate->TextBE to SAL, then browse to your .bt file"));
	strHowtouse.Append(_T(" (in TextBE format). The file will be translated & the results displayed."));
	strHowtouse.Append(_T("\r\nTo save the translation, press \"Save Translation\".\r\nTo save the translation time, press \"Save times\"."));

	AfxMessageBox(strHowtouse);
}

void CSALTranslatorView::OnHelpErrormessages()
{
	CString strErrors = _T("POSSIBLE ERROR MESSAGES AND THEIR CAUSES:");
	strErrors.Append(_T("\r\n\r\n\"Parse Error: An invalid character was found in text content.\""));
	strErrors.Append(_T("\r\n(or other Parse Errors)"));
	strErrors.Append(_T("\r\n----Cause: The file was not a valid XML file."));
	strErrors.Append(_T("\r\n\r\n\"Could not find component name (or behavior or type) for node xx\""));
	strErrors.Append(_T("\r\n----Cause: The file was not in the correct BESE XML format."));
	strErrors.Append(_T("\r\n\r\n\Behavior Tree Parsing Errors\r\n----These are errors that occurred when the BT was parsed\r\n"));
	strErrors.Append(_T("prior to translation. The BT is not in the valid Behavior Tree syntax. \r\nUse the error description as a guide to modify your Behavior Tree."));
	AfxMessageBox(strErrors);
}

void CSALTranslatorView::OnTranslateTextbetosal()
{
	// Start the SAL translator.
	m_cTranslateMain.ParseBT(0, false, false);
	
}

void CSALTranslatorView::OnTranslateTextbetouppaal()
{
	AfxMessageBox(_T("Sorry, this feature is not yet available in this version of the SAL Translator.\r\nIt is currently only available in the Integrare SAL Translator."));
	////m_cTranslateUPPAAL.ParseBT(iBTId, false, false);
}


void CSALTranslatorView::OnEnChangeEdit2()
{
	// TODO:  If this is a RICHEDIT control, the control will not
	// send this notification unless you override the CView::OnInitDialog()
	// function and call CRichEditCtrl().SetEventMask()
	// with the ENM_CHANGE flag ORed into the mask.

	// TODO:  Add your control notification handler code here
}
