// SALTranslatorView.h : interface of the CSALTranslatorView class
//


#pragma once


class CSALTranslatorView : public CView
{
protected: // create from serialization only
	CSALTranslatorView();
	DECLARE_DYNCREATE(CSALTranslatorView)

// Attributes
public:
	CSALTranslatorDoc* GetDocument() const;

// Operations
public:

// Overrides
public:
	virtual void OnDraw(CDC* pDC);  // overridden to draw this view
	virtual BOOL PreCreateWindow(CREATESTRUCT& cs);
protected:
	virtual BOOL OnPreparePrinting(CPrintInfo* pInfo);
	virtual void OnBeginPrinting(CDC* pDC, CPrintInfo* pInfo);
	virtual void OnEndPrinting(CDC* pDC, CPrintInfo* pInfo);

// Implementation
public:
	virtual ~CSALTranslatorView();
#ifdef _DEBUG
	virtual void AssertValid() const;
	virtual void Dump(CDumpContext& dc) const;
#endif

protected:

// Generated message map functions
protected:
	DECLARE_MESSAGE_MAP()
public:
	afx_msg void OnTranslateTosal();
public:
	afx_msg void OnOptionsSetoptions();
public:
	afx_msg void OnTranslateTouppaal();
public:
	afx_msg void OnHelpHowtouse();
public:
	afx_msg void OnHelpErrormessages();
public:
	afx_msg void OnTranslateTextbetosal();
public:
	afx_msg void OnTranslateTextbetouppaal();
	afx_msg void OnEnChangeEdit2();
};

#ifndef _DEBUG  // debug version in SALTranslatorView.cpp
inline CSALTranslatorDoc* CSALTranslatorView::GetDocument() const
   { return reinterpret_cast<CSALTranslatorDoc*>(m_pDocument); }
#endif

