package com.kodnest.pattern.alphabets;
public class PatternB {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++)
		{
			for(int j=1; j<=11; j++)
			{
				if(i==1 || j==1 || i==6 || j==11 || i==11)
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