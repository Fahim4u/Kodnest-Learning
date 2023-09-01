package com.kodnest.pattern.alphabets;
public class PatternV {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if((i==j && j<=5) || (i+j==10 && j>=6))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}	