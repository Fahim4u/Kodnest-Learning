package com.Kodnest.ControlConstruct.SimpleIf;
import java.util.Scanner;
public class SimpleIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = scan.nextInt();
		System.out.println("Welcome to Kodnest");
		//Simple if conditional control construct
		if(marks>80)
		{
			System.out.println("Welcome to TechClub");
		}
		scan.close();
	}
}