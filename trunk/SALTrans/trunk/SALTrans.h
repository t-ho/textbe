

namespace MathFuncs
{
    class SALTrans
    {
		
		//static CTranslateSALMain m_cTranslateMain;
    public:
        // Returns a + b
        static __declspec(dllexport) double Add(double a, double b);

        // Returns a - b
        static __declspec(dllexport) double Subtract(double a, double b);

        // Returns a * b
        static __declspec(dllexport) double Multiply(double a, double b);
//extern "C"
        // Returns a / b
        // Throws DivideByZeroException if b is 0
        static __declspec(dllexport) double Divide(double a, double b);

		static __declspec(dllexport) const wchar_t* Translate(const wchar_t* strTree, int iPriority, int iBuff, int iWithSets, const wchar_t* strSets, const wchar_t* strInit);
        
		
	};
}
