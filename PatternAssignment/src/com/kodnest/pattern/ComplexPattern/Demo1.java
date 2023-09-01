package com.kodnest.pattern.ComplexPattern;
public class Demo1 {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++)
		{
			for(int j =1; j<=13; j++)
			{
				if((i==1&&j<=6) || (j==1&&i<=6) || (i==11&&j>=8) || (i==6&&j<=6) || (i==6&&j>=8) || (j==6&&i<=6) || (j==13&&i>=6)|| (j==8&&i>=6))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}