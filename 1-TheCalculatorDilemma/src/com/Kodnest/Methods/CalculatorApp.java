package com.Kodnest.Methods;
import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey Alice! What type of Calcualtion would you like to do?");
		System.out.println("For Addition enter 1");
		System.out.println("For Subtraction enter 2");
		System.out.println("For multiplication enter 3");
		System.out.println("For division (to get quotient) enter 4");
		System.out.println("For division (to get remainder) enter 5");
		int cal = scan.nextInt();
		if( cal>5)
		{
			System.out.println("Wrong input");
			System.exit(0);
		}
		System.out.println("Enter 2 numbers to process further");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		Calculator calculator = new Calculator();
		calculator.calculator(cal, a, b);
	}
}
