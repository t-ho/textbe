// SALTranslatorDoc.cpp : implementation of the CSALTranslatorDoc class
//

#include "stdafx.h"
#include "SALTranslator.h"

#include "SALTranslatorDoc.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


// CSALTranslatorDoc

IMPLEMENT_DYNCREATE(CSALTranslatorDoc, CDocument)

BEGIN_MESSAGE_MAP(CSALTranslatorDoc, CDocument)
END_MESSAGE_MAP()


// CSALTranslatorDoc construction/destruction

CSALTranslatorDoc::CSALTranslatorDoc()
{
	// TODO: add one-time construction code here

}

CSALTranslatorDoc::~CSALTranslatorDoc()
{
}

BOOL CSALTranslatorDoc::OnNewDocument()
{
	if (!CDocument::OnNewDocument())
		return FALSE;

	// TODO: add reinitialization code here
	// (SDI documents will reuse this document)

	return TRUE;
}




// CSALTranslatorDoc serialization

void CSALTranslatorDoc::Serialize(CArchive& ar)
{
	if (ar.IsStoring())
	{
		// TODO: add storing code here
	}
	else
	{
		// TODO: add loading code here
	}
}


// CSALTranslatorDoc diagnostics

#ifdef _DEBUG
void CSALTranslatorDoc::AssertValid() const
{
	CDocument::AssertValid();
}

void CSALTranslatorDoc::Dump(CDumpContext& dc) const
{
	CDocument::Dump(dc);
}
#endif //_DEBUG


// CSALTranslatorDoc commands


