package com.Kodnest.ObjectOrientation.Example2;
public class Table {
		int seatingCapacity;
		int cost;
		String color;
		String brand;
		
		void allowsToSit()
		{
			System.out.println("User can sit on the table which is "+color+" in color");
		}
		void allowToWrite()
		{
			System.out.println("User can write in the book b keepint it on the table which cost Rs "+cost);
		}		
}
