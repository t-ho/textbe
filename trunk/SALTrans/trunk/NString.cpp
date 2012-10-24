#include "StdAfx.h"
#include "NString.h"
#include <sstream> 


NString::NString(void)
{

}

NString::~NString(void)
{
}

NString::NString(const NString& strSecondString){
	m_strInfo = strSecondString.m_strInfo;
}

NString::NString(const wchar_t* charlist){
	m_strInfo = charlist;
}

NString NString::operator+(NString& strSecondString){
	std::wstring newstring = m_strInfo + strSecondString.GetString();
	NString newNString;
	newNString.SetString(newstring);
	return newNString;
}

NString NString::operator+(const wchar_t* charlist){
	std::wstring newstring = m_strInfo + charlist;
	NString newNString;
	newNString.SetString(newstring);
	return newNString;
}

void NString::operator=(const wchar_t* charlist){
	m_strInfo = charlist;
}

void NString::operator=(NString& strSecondString){
	m_strInfo = strSecondString.GetString();
}

std::wstring NString::GetString(){
	return m_strInfo;
}

void NString::SetString(std::wstring strSecondString){
	m_strInfo = strSecondString;
}

void NString::Delete(int iInitialPosition, int iLength){
	m_strInfo.replace(0,iLength,_T(""));
}

int NString::Length(){
	return m_strInfo.length();
}

int NString::GetLength(){
	return m_strInfo.length();
}

int NString::Find(NString strSecondString){
	size_t result;
	result = m_strInfo.find(strSecondString.GetString());
	if (result != std::string::npos){
		return (int)result;
	}
	return -1;
}

int NString::Find(const wchar_t* charlist){
	size_t result;
	result = m_strInfo.find(charlist);
	if (result != std::string::npos){
		return (int)result;
	}
	return -1;
}

void NString::Append(NString strSecondString){
	m_strInfo.append(strSecondString.GetString());
}

void NString::Append(const wchar_t* charlist){
	m_strInfo.append(charlist);
}

void NString::Replace(wchar_t* charlist, wchar_t* charlist2){
	size_t position;
	int iLength = wcslen(charlist);
	position = m_strInfo.find(charlist);
	while (position != std::string::npos){
		m_strInfo.replace(position,iLength,charlist2);
		position = m_strInfo.find(charlist);
	}
}

void NString::Replace(NString strToReplace, NString strReplaceWith){
	size_t position;
	int iLength = strToReplace.GetString().length();
	position = m_strInfo.find(strToReplace.GetString());
	while (position != std::string::npos){
		m_strInfo.replace(position,iLength,strReplaceWith.GetString());
		position = m_strInfo.find(strToReplace.GetString());
	}
}

NString NString::Left(int iLength){
	std::wstring strLeft;
	strLeft = m_strInfo.substr(0, iLength);
	NString strNewString;
	strNewString.SetString(strLeft);
	return strNewString;
}

NString NString::Right(int iLength){
	std::wstring strRight;
	strRight = m_strInfo.substr(m_strInfo.length()-iLength, iLength);
	NString strNewString;
	strNewString.SetString(strRight);
	return strNewString;
}


NString NString::Mid(int iPosition, int iLength){
	std::wstring strMid;
	strMid = m_strInfo.substr(iPosition, iLength);
	NString strNewString;
	strNewString.SetString(strMid);
	return strNewString;
}

NString NString::MakeUpper(){
	std::wstring strFirstLetter = m_strInfo.substr(0,1);
	NString strNewString;
	std::wstring strNewOne = m_strInfo;
	if (strFirstLetter == _T("a")){
		strNewOne.replace(0,1,_T("A"));
	}else if (strFirstLetter == _T("b")){
		strNewOne.replace(0,1,_T("B"));
	}else if (strFirstLetter == _T("c")){
		strNewOne.replace(0,1,_T("C"));
	}else if (strFirstLetter == _T("d")){
		strNewOne.replace(0,1,_T("D"));
	}else if (strFirstLetter == _T("e")){
		strNewOne.replace(0,1,_T("E"));
	}else if (strFirstLetter == _T("f")){
		strNewOne.replace(0,1,_T("F"));
	}else if (strFirstLetter == _T("g")){
		strNewOne.replace(0,1,_T("G"));
	}else if (strFirstLetter == _T("h")){
		strNewOne.replace(0,1,_T("H"));
	}else if (strFirstLetter == _T("i")){
		strNewOne.replace(0,1,_T("I"));
	}else if (strFirstLetter == _T("j")){
		strNewOne.replace(0,1,_T("J"));
	}else if (strFirstLetter == _T("k")){
		strNewOne.replace(0,1,_T("K"));
	}else if (strFirstLetter == _T("l")){
		strNewOne.replace(0,1,_T("L"));
	}else if (strFirstLetter == _T("m")){
		strNewOne.replace(0,1,_T("M"));
	}else if (strFirstLetter == _T("n")){
		strNewOne.replace(0,1,_T("N"));
	}else if (strFirstLetter == _T("o")){
		strNewOne.replace(0,1,_T("O"));
	}else if (strFirstLetter == _T("p")){
		strNewOne.replace(0,1,_T("P"));
	}else if (strFirstLetter == _T("q")){
		strNewOne.replace(0,1,_T("Q"));
	}else if (strFirstLetter == _T("r")){
		strNewOne.replace(0,1,_T("R"));
	}else if (strFirstLetter == _T("s")){
		strNewOne.replace(0,1,_T("S"));
	}else if (strFirstLetter == _T("t")){
		strNewOne.replace(0,1,_T("T"));
	}else if (strFirstLetter == _T("u")){
		strNewOne.replace(0,1,_T("U"));
	}else if (strFirstLetter == _T("v")){
		strNewOne.replace(0,1,_T("V"));
	}else if (strFirstLetter == _T("w")){
		strNewOne.replace(0,1,_T("W"));
	}else if (strFirstLetter == _T("x")){
		strNewOne.replace(0,1,_T("X"));
	}else if (strFirstLetter == _T("y")){
		strNewOne.replace(0,1,_T("Y"));
	}else if (strFirstLetter == _T("z")){
		strNewOne.replace(0,1,_T("Z"));
	}
	strNewString.SetString(strNewOne);
	return strNewString;
}

NString NString::MakeLower(){
	std::wstring strFirstLetter = m_strInfo.substr(0,1);
	NString strNewString;
	std::wstring strNewOne = m_strInfo;
	if (strFirstLetter == _T("A")){
		strNewOne.replace(0,1,_T("a"));
	}else if (strFirstLetter == _T("B")){
		strNewOne.replace(0,1,_T("b"));
	}else if (strFirstLetter == _T("C")){
		strNewOne.replace(0,1,_T("c"));
	}else if (strFirstLetter == _T("D")){
		strNewOne.replace(0,1,_T("d"));
	}else if (strFirstLetter == _T("E")){
		strNewOne.replace(0,1,_T("e"));
	}else if (strFirstLetter == _T("F")){
		strNewOne.replace(0,1,_T("f"));
	}else if (strFirstLetter == _T("G")){
		strNewOne.replace(0,1,_T("g"));
	}else if (strFirstLetter == _T("H")){
		strNewOne.replace(0,1,_T("h"));
	}else if (strFirstLetter == _T("I")){
		strNewOne.replace(0,1,_T("i"));
	}else if (strFirstLetter == _T("J")){
		strNewOne.replace(0,1,_T("j"));
	}else if (strFirstLetter == _T("K")){
		strNewOne.replace(0,1,_T("k"));
	}else if (strFirstLetter == _T("L")){
		strNewOne.replace(0,1,_T("l"));
	}else if (strFirstLetter == _T("M")){
		strNewOne.replace(0,1,_T("m"));
	}else if (strFirstLetter == _T("N")){
		strNewOne.replace(0,1,_T("n"));
	}else if (strFirstLetter == _T("O")){
		strNewOne.replace(0,1,_T("o"));
	}else if (strFirstLetter == _T("P")){
		strNewOne.replace(0,1,_T("p"));
	}else if (strFirstLetter == _T("Q")){
		strNewOne.replace(0,1,_T("q"));
	}else if (strFirstLetter == _T("R")){
		strNewOne.replace(0,1,_T("r"));
	}else if (strFirstLetter == _T("S")){
		strNewOne.replace(0,1,_T("s"));
	}else if (strFirstLetter == _T("T")){
		strNewOne.replace(0,1,_T("t"));
	}else if (strFirstLetter == _T("U")){
		strNewOne.replace(0,1,_T("u"));
	}else if (strFirstLetter == _T("V")){
		strNewOne.replace(0,1,_T("v"));
	}else if (strFirstLetter == _T("W")){
		strNewOne.replace(0,1,_T("w"));
	}else if (strFirstLetter == _T("X")){
		strNewOne.replace(0,1,_T("x"));
	}else if (strFirstLetter == _T("Y")){
		strNewOne.replace(0,1,_T("y"));
	}else if (strFirstLetter == _T("Z")){
		strNewOne.replace(0,1,_T("z"));
	}
	strNewString.SetString(strNewOne);
	return strNewString;
}

bool NString::operator==(NString& strSecondString){
	if (m_strInfo == strSecondString.GetString()){
		return true;
	}
	return false;
}

bool NString::operator==(const wchar_t* charlist){
	if (m_strInfo == charlist){
		return true;
	}
	return false;
}

bool NString::operator!=(NString& strSecondString){
	if (m_strInfo != strSecondString.GetString()){
		return true;
	}
	return false;
}

bool NString::operator!=(const wchar_t* charlist){
	if (m_strInfo != charlist){
		return true;
	}
	return false;
}

void NString::Format(NString strOriginal, int iNumber){
	// Convert the number part into a string.
	std::wstringstream stream;
	stream << iNumber;
	std::wstring strNumber = stream.str();
	// Put the number into the main string, replacing the %d part.
	std::wstring strMain = strOriginal.GetString();
	size_t position = strMain.find(_T("%d"));
	strMain.replace(position,2,strNumber);
	m_strInfo = strMain;
}

NString NString::Tokenize(wchar_t* strDelimiters, int &iStart){
	NString strNewString;
	size_t position;
	std::wstring strToken;
	if (iStart == -1){
		strNewString = _T("");
		return strNewString;
	}
	position = m_strInfo.find_first_of(strDelimiters, iStart);
	if (position == iStart){ // Ignore leading delimiters, just like Tokenize in CString does.
		iStart = iStart + 1;
	}
	if (position != std::wstring::npos){  // A token delimiter was found.
		// Get the token (the string upto the delimiter).
		strToken = m_strInfo.substr(iStart, position-iStart);
		iStart = (int) position + 1;
	}else{ // No token delimiter
		// Get the token (the string upto the end).
		strToken = m_strInfo.substr(iStart);
		iStart = -1;
	}
	strNewString.SetString(strToken);
	return strNewString;
}

void NString::Truncate(int iLength){
	m_strInfo.replace(iLength, m_strInfo.length()-iLength, _T(""));
}

NString NString::Trim(){
	NString strNewString;
	if (m_strInfo != _T("")){
		// Remove whitespaces at the start.
		std::wstring strFirstLetter = m_strInfo.substr(0,1);
		while ((strFirstLetter == _T(" ")) || (strFirstLetter == _T("\t"))){
			// It is a whitespace character so remove it.
			m_strInfo.replace(0,1,_T(""));
			strFirstLetter = m_strInfo.substr(0,1);
		}

		// Remove whitespaces at the end.
		std::wstring strLastLetter = m_strInfo.substr(m_strInfo.length()-1,1);
		while ((strLastLetter == _T(" ")) || (strLastLetter == _T("\t"))){
			// It is a whitespace character so remove it.
			m_strInfo.replace(m_strInfo.length()-1,1,_T(""));
			strFirstLetter = m_strInfo.substr(m_strInfo.length()-1,1);
		}
	}
	strNewString.SetString(m_strInfo); // If it was null initially then it will just return the null string.
	return strNewString;
}

bool NString::IsEmpty(){
	if (m_strInfo == _T("")){
		return true;
	}
	return false;
}

NString operator+(const wchar_t* charlist, NString& strSecondString){ 
/* This is called for things like NString test2 = _T("hello");
NString test = _T("hi") + test2;
(where the _T() part comes first in the addition.
Note that it is not a member of the NString class.
*/
	std::wstring newstring = charlist + strSecondString.GetString();
	NString newNString;
	newNString.SetString(newstring);
	return newNString;
 }

