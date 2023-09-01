package com.kodnest.pattern.alphabets;
public class PatternM {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if(j==9 || j==1||(i==j && j<=5) || (i+j==10 && j>=6))
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