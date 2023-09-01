package com.kodnest.pattern.alphabets;
public class PatternQ {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if((i==1 && j<=7) || (i==7 && j<=7) || (j==1 && i<=7) || (j==7 && i<=7) || (i==j && i>=5 && j<=9))
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