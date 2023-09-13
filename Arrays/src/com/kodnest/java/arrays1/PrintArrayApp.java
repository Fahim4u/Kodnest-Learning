package com.kodnest.java.arrays1;
import java.util.Scanner;
public class PrintArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter an element of the array");
			arr[i] = scan.nextInt();
		}
		PrintArray a = new PrintArray();
		a.printArray(arr);
		scan.close();
	}
}