// This is the main DLL file.

#include "stdafx.h"
#include "TranslateSALMain.h"
#include "SALTrans.h"

#include <iostream>
#include <stdexcept>

using namespace std;
namespace MathFuncs
{

    double SALTrans::Add(double a, double b)
    {
        return a + b;
    }

    double SALTrans::Subtract(double a, double b)
    {
        return a - b;
    }

    double SALTrans::Multiply(double a, double b)
    {
        return a * b;
    }

    double SALTrans::Divide(double a, double b)
    {
        if (b == 0)
        {
            throw new invalid_argument("b cannot be zero!");
        }

        return a / b;
    }

	/*
@param: const wchar_t* strTree - the .bt representation of the tree
		int iPriority = 1 for “no prioritisation” (default)
					= 2 for “with prioritisation”
		int iBuff = 1 for “messages buffered” (default)
				= 2 for “no buffering”
		int iWithSets = 1 for “do not use sets” (default) 
					= 2 for “use sets”
		const wchar_t* strSets - The sets information (can be an empty string if no sets are required).
		const wchar_t* strInit – The initialisation information (can be an empty string if not required).
@return: wchar_t* - a string containing the SAL translation
*/
const wchar_t* SALTrans::Translate(const wchar_t* strTree, int iPriority, int iBuff, int iWithSets, const wchar_t* strSets, const wchar_t* strInit){
	CTranslateSALMain cTranslator; 
//	const wchar_t* result2 = _T("This worked!!");
	cTranslator.SelectOptions(strTree, iPriority, iBuff, iWithSets, strSets, strInit);
	NString strNResult = cTranslator.ParseBT(0, false, false);
	static std::wstring strWResult = strNResult.GetString();
	//static const wchar_t* strFirstResult = strWResult.c_str();
	//strResult4 = strWResult.c_str();
	//strResult4 = wcscpy(strResult4, strFirstResult); 
	return strWResult.c_str();
}

}