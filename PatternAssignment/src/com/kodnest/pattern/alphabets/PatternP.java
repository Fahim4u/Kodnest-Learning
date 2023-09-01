package com.kodnest.pattern.alphabets;
public class PatternP {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=8; j++)
			{
				if(j==1 || (j==8 && i<=5) ||i==5 || i==1)
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