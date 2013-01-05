#pragma once
#include <string>


class NString 
{
public:
	NString(void);
public:
	~NString(void);
	 NString(const NString& strSecondString);
	 NString(const char* charlist); // This is called when a string is initialised like NString test = "hello";
	 NString operator+(const NString strSecondString);
	 NString operator+(const char* charlist);
	 void operator=(const char* charlist);  // This is called when a string is set to another value, like NString test;
																										// test = "hello";
	 void operator=(const NString strSecondString); 
	 bool operator==(NString& strSecondString);  // This is called for things like if(strName == strOther){
	 bool operator==(const char* charlist);	// This is called for if(strName == "hello"){
	 bool operator!=(NString& strSecondString);  // This is called for things like if(strName != strOther){
	 bool operator!=(const char* charlist);	// This is called for if(strName != "hello"){
	 std::string GetString() const;
	 void SetString(std::string strSecondString);
	 void Delete(int iInitialPosition, int iLength);
	 int Length();
	 int Find(NString strSecondString);
	 int Find(const char* charlist);
	 void Append(const NString strSecondString);
	 void Append(const char* charlist);
	 void Replace(char* charlist,char* charlist2);
	 void Replace(NString strToReplace, NString strReplaceWith);
	 NString Left(int iLength);
	 NString Mid(int iPosition, int iLength);
	 NString Right(int iLength);
	 NString MakeUpper();
	 NString MakeLower();
	 void Format(NString strOriginal, int iNumber);
	 int GetLength();
	 NString Tokenize(const char* strDelimiters, int &iStart);
	 void Truncate(int iLength);
	 NString Trim();
	 bool IsEmpty();

	 friend NString operator+(const char* charlist, NString& strSecondString);  	 

private:
	std::string m_strInfo;
};
