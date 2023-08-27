package com.Kodnest.JumpStatement.Break;
public class Demo {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++)
		{
			System.out.println("Kodnest");
			if(i==2)
			{
				System.out.println("Finished");
				break;
			}
		}
	}
}