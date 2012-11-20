#pragma once

#include "Translator.h"
#include <stdexcept>

using namespace std;

namespace MathFuncs
{

int Translator::Add(int a, int b){
	return a + b;
}

double Translator::Subtract(double a, double b){
	return a - b;
}

double Translator::Multiply(double a, double b){
	return a * b;
}

}