// SALTranslatorDoc.h : interface of the CSALTranslatorDoc class
//


#pragma once


class CSALTranslatorDoc : public CDocument
{
protected: // create from serialization only
	CSALTranslatorDoc();
	DECLARE_DYNCREATE(CSALTranslatorDoc)

// Attributes
public:

// Operations
public:

// Overrides
public:
	virtual BOOL OnNewDocument();
	virtual void Serialize(CArchive& ar);

// Implementation
public:
	virtual ~CSALTranslatorDoc();
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
};


