public class MethodOverloadingCalculatorApp {
	int calculate(int a, int b)
	{
		return a+b;
	}
	double calculate(int a, double b )
	{
		return a-b;
	}
	double calculate(double a, int b )
	{
		return a*b;
	}
	double calculate(double a, double b)
	{
		return a/b;
	}
}
