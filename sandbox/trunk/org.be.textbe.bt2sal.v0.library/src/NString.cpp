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

NString::NString(const char* charlist){
	m_strInfo = charlist;
}

NString NString::operator+(NString& strSecondString){
	std::string nestring = m_strInfo + strSecondString.GetString();
	NString newNString;
	newNString.SetString(nestring);
	return newNString;
}

NString NString::operator+(const char* charlist){
	std::string nestring = m_strInfo + charlist;
	NString newNString;
	newNString.SetString(nestring);
	return newNString;
}

void NString::operator=(const char* charlist){
	m_strInfo = charlist;
}

void NString::operator=(NString& strSecondString){
	m_strInfo = strSecondString.GetString();
}

std::string NString::GetString(){
	return m_strInfo;
}

void NString::SetString(std::string strSecondString){
	m_strInfo = strSecondString;
}

void NString::Delete(int iInitialPosition, int iLength){

	m_strInfo.replace(0,iLength,"");
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

int NString::Find(const char* charlist){
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

void NString::Append(const char* charlist){
	m_strInfo.append(charlist);
}

void NString::Replace(char* charlist, char* charlist2){
	size_t position;
	int iLength =strlen(charlist);
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
	std::string strLeft;
	strLeft = m_strInfo.substr(0, iLength);
	NString strNewString;
	strNewString.SetString(strLeft);
	return strNewString;
}

NString NString::Right(int iLength){
	std::string strRight;
	strRight = m_strInfo.substr(m_strInfo.length()-iLength, iLength);
	NString strNewString;
	strNewString.SetString(strRight);
	return strNewString;
}


NString NString::Mid(int iPosition, int iLength){
	std::string strMid;
	strMid = m_strInfo.substr(iPosition, iLength);
	NString strNewString;
	strNewString.SetString(strMid);
	return strNewString;
}

NString NString::MakeUpper(){
	std::string strFirstLetter = m_strInfo.substr(0,1);
	NString strNewString;
	std::string strNewOne = m_strInfo;
	if (strFirstLetter == "a"){
		strNewOne.replace(0,1,"A");
	}else if (strFirstLetter == "b"){
		strNewOne.replace(0,1,"B");
	}else if (strFirstLetter == "c"){
		strNewOne.replace(0,1,"C");
	}else if (strFirstLetter == "d"){
		strNewOne.replace(0,1,"D");
	}else if (strFirstLetter == "e"){
		strNewOne.replace(0,1,"E");
	}else if (strFirstLetter == "f"){
		strNewOne.replace(0,1,"F");
	}else if (strFirstLetter == "g"){
		strNewOne.replace(0,1,"G");
	}else if (strFirstLetter == "h"){
		strNewOne.replace(0,1,"H");
	}else if (strFirstLetter == "i"){
		strNewOne.replace(0,1,"I");
	}else if (strFirstLetter == "j"){
		strNewOne.replace(0,1,"J");
	}else if (strFirstLetter == "k"){
		strNewOne.replace(0,1,"K");
	}else if (strFirstLetter == "l"){
		strNewOne.replace(0,1,"L");
	}else if (strFirstLetter == "m"){
		strNewOne.replace(0,1,"M");
	}else if (strFirstLetter == "n"){
		strNewOne.replace(0,1,"N");
	}else if (strFirstLetter == "o"){
		strNewOne.replace(0,1,"O");
	}else if (strFirstLetter == "p"){
		strNewOne.replace(0,1,"P");
	}else if (strFirstLetter == "q"){
		strNewOne.replace(0,1,"Q");
	}else if (strFirstLetter == "r"){
		strNewOne.replace(0,1,"R");
	}else if (strFirstLetter == "s"){
		strNewOne.replace(0,1,"S");
	}else if (strFirstLetter == "t"){
		strNewOne.replace(0,1,"T");
	}else if (strFirstLetter == "u"){
		strNewOne.replace(0,1,"U");
	}else if (strFirstLetter == "v"){
		strNewOne.replace(0,1,"V");
	}else if (strFirstLetter == "w"){
		strNewOne.replace(0,1,"W");
	}else if (strFirstLetter == "x"){
		strNewOne.replace(0,1,"X");
	}else if (strFirstLetter == "y"){
		strNewOne.replace(0,1,"Y");
	}else if (strFirstLetter == "z"){
		strNewOne.replace(0,1,"Z");
	}
	strNewString.SetString(strNewOne);
	return strNewString;
}

NString NString::MakeLower(){
	std::string strFirstLetter = m_strInfo.substr(0,1);
	NString strNewString;
	std::string strNewOne = m_strInfo;
	if (strFirstLetter == "A"){
		strNewOne.replace(0,1,"a");
	}else if (strFirstLetter == "B"){
		strNewOne.replace(0,1,"b");
	}else if (strFirstLetter == "C"){
		strNewOne.replace(0,1,"c");
	}else if (strFirstLetter == "D"){
		strNewOne.replace(0,1,"d");
	}else if (strFirstLetter == "E"){
		strNewOne.replace(0,1,"e");
	}else if (strFirstLetter == "F"){
		strNewOne.replace(0,1,"f");
	}else if (strFirstLetter == "G"){
		strNewOne.replace(0,1,"g");
	}else if (strFirstLetter == "H"){
		strNewOne.replace(0,1,"h");
	}else if (strFirstLetter == "I"){
		strNewOne.replace(0,1,"i");
	}else if (strFirstLetter == "J"){
		strNewOne.replace(0,1,"j");
	}else if (strFirstLetter == "K"){
		strNewOne.replace(0,1,"k");
	}else if (strFirstLetter == "L"){
		strNewOne.replace(0,1,"l");
	}else if (strFirstLetter == "M"){
		strNewOne.replace(0,1,"m");
	}else if (strFirstLetter == "N"){
		strNewOne.replace(0,1,"n");
	}else if (strFirstLetter == "O"){
		strNewOne.replace(0,1,"o");
	}else if (strFirstLetter == "P"){
		strNewOne.replace(0,1,"p");
	}else if (strFirstLetter == "Q"){
		strNewOne.replace(0,1,"q");
	}else if (strFirstLetter == "R"){
		strNewOne.replace(0,1,"r");
	}else if (strFirstLetter == "S"){
		strNewOne.replace(0,1,"s");
	}else if (strFirstLetter == "T"){
		strNewOne.replace(0,1,"t");
	}else if (strFirstLetter == "U"){
		strNewOne.replace(0,1,"u");
	}else if (strFirstLetter == "V"){
		strNewOne.replace(0,1,"v");
	}else if (strFirstLetter == "W"){
		strNewOne.replace(0,1,"w");
	}else if (strFirstLetter == "X"){
		strNewOne.replace(0,1,"x");
	}else if (strFirstLetter == "Y"){
		strNewOne.replace(0,1,"y");
	}else if (strFirstLetter == "Z"){
		strNewOne.replace(0,1,"z");
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

bool NString::operator==(const char* charlist){
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

bool NString::operator!=(const char* charlist){
	if (m_strInfo != charlist){
		return true;
	}
	return false;
}

void NString::Format(NString strOriginal, int iNumber){
	// Convert the number part into a string.
	std::stringstream stream;
	stream << iNumber;
	std::string strNumber = stream.str();
	// Put the number into the main string, replacing the %d part.
	std::string strMain = strOriginal.GetString();
	size_t position = strMain.find("%d");
	strMain.replace(position,2,strNumber);
	m_strInfo = strMain;
}

NString NString::Tokenize(char* strDelimiters, int &iStart){
	NString strNewString;
	size_t position;
	std::string strToken;
	if (iStart == -1){
		strNewString = "";
		return strNewString;
	}
	position = m_strInfo.find_first_of(strDelimiters, iStart);
	if (position == iStart){ // Ignore leading delimiters, just like Tokenize in CString does.
		iStart = iStart + 1;
	}
	if (position != std::string::npos){  // A token delimiter was found.
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
	m_strInfo.replace(iLength, m_strInfo.length()-iLength, "");
}

NString NString::Trim(){
	NString strNewString;
	if (m_strInfo != ""){
		// Remove whitespaces at the start.
		std::string strFirstLetter = m_strInfo.substr(0,1);
		while ((strFirstLetter == " ") || (strFirstLetter == "\t")){
			// It is a whitespace character so remove it.
			m_strInfo.replace(0,1,"");
			strFirstLetter = m_strInfo.substr(0,1);
		}

		// Remove whitespaces at the end.
		std::string strLastLetter = m_strInfo.substr(m_strInfo.length()-1,1);
		while ((strLastLetter == " ") || (strLastLetter == "\t")){
			// It is a whitespace character so remove it.
			m_strInfo.replace(m_strInfo.length()-1,1,"");
			strFirstLetter = m_strInfo.substr(m_strInfo.length()-1,1);
		}
	}
	strNewString.SetString(m_strInfo); // If it was null initially then it will just return the null string.
	return strNewString;
}

bool NString::IsEmpty(){
	if (m_strInfo == ""){
		return true;
	}
	return false;
}

NString operator+(const char* charlist, NString& strSecondString){ 
/* This is called for things like NString test2 = "hello";
NString test = "hi" + test2;
(where the  part comes first in the addition.
Note that it is not a member of the NString class.
*/
	std::string nestring = charlist + strSecondString.GetString();
	NString newNString;
	newNString.SetString(nestring);
	return newNString;
 }

