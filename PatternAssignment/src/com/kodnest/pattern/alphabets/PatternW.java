package com.kodnest.pattern.alphabets;
public class PatternW {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				if((j==1) || (j==10)  || (i==j && j>=6 && i>=5) || (i+j==11 && j<=5 && i>=5))
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