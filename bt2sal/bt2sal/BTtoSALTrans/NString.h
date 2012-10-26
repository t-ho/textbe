#pragma once
#include "stdafx.h" // Take this out later and disable use precompiled headers in right-click SALTranslator -> Properties
//-> C/C++ -> Precompiled Headers.
#include <string>

class NString 
{
public:
	NString(void);
public:
	~NString(void);
	 NString(const NString& strSecondString);
	 NString(const wchar_t* charlist); // This is called when a string is initialised like NString test = _T("hello");
	 NString operator+(NString& strSecondString);
	 NString operator+(const wchar_t* charlist);
	 void operator=(const wchar_t* charlist);  // This is called when a string is set to another value, like NString test;
																										// test = _T("hello");
	 void operator=(NString& strSecondString); 
	 bool operator==(NString& strSecondString);  // This is called for things like if(strName == strOther){
	 bool operator==(const wchar_t* charlist);	// This is called for if(strName == _T("hello")){
	 bool operator!=(NString& strSecondString);  // This is called for things like if(strName != strOther){
	 bool operator!=(const wchar_t* charlist);	// This is called for if(strName != _T("hello")){
	 std::wstring GetString();
	 void SetString(std::wstring strSecondString);
	 void Delete(int iInitialPosition, int iLength);
	 int Length();
	 int Find(NString strSecondString);
	 int Find(const wchar_t* charlist);
	 void Append(NString strSecondString);
	 void Append(const wchar_t* charlist);
	 void Replace(wchar_t* charlist,wchar_t* charlist2);
	 void Replace(NString strToReplace, NString strReplaceWith);
	 NString Left(int iLength);
	 NString Mid(int iPosition, int iLength);
	 NString Right(int iLength);
	 NString MakeUpper();
	 NString MakeLower();
	 void Format(NString strOriginal, int iNumber);
	 int GetLength();
	 NString Tokenize(wchar_t* strDelimiters, int &iStart);
	 void Truncate(int iLength);
	 NString Trim();
	 bool IsEmpty();

	 friend NString operator+(const wchar_t* charlist, NString& strSecondString);  	 

private:
	std::wstring m_strInfo;
};
