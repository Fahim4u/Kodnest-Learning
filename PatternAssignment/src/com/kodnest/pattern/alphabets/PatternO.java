package com.kodnest.pattern.alphabets;
public class PatternO {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if(j==1 && (i>=2 && i<=8) || j==10 && (i>=2 && i<=8)|| i==1 && j>=2&&j<=9 || i==9 && j>=2 && j<=9)
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