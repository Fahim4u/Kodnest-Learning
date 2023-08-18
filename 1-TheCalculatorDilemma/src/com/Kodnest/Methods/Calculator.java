package com.Kodnest.Methods;
public class Calculator {
	void calculator(int cal, int a, int b)
	{
	switch(cal)
		{
			case 1:
				System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
				break;
			case 2:
				System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
				break;
			case 3:
				System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
				break;
			case 4:
				System.out.println("Division (giving quotient) of "+a+" and "+b+" is "+(a/b));
				break;
			case 5:
				System.out.println("Division (giving remainder) "+a+" and "+b+" is "+(a%b));
				default:
					System.out.println("invalid input");
					
		}
	}
}