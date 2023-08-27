package com.Kodnest.JumpStatement.Continue;
public class Demo {
	public static void main(String[] args) {
		for(int i=0; i<=7; i++)
		{
			if(i==3)
			{
				System.out.println("Kodnest");
				continue;
			}
			System.out.println("Technologies");
		}
	}
}