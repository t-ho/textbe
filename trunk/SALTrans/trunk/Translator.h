namespace MathFuncs
{
    class Translator{
    public:
        // Returns a + b
        static __declspec(dllexport) int Add(int a, int b);

        // Returns a - b
        static __declspec(dllexport) double Subtract(double a, double b);

        // Returns a * b
        static __declspec(dllexport) double Multiply(double a, double b);
};

}

