package com.kodnest.pattern.alphabets;
public class PatternJ {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if(i==1 || j==6 || (i==9 && j<=5) || (j==1 && i>=6))
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