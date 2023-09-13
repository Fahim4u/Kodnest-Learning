package com.kodnest.java.arrays;
import java.util.Scanner;
public class ArraySwap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[] = new int[scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter 2 indexes of the array to swap");
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.println("Before swapping ");
		System.out.print("Arr--> ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int help;
		help = arr[m-1];
		arr[m-1] = arr[n-1];
		arr[n-1] = help;
		System.out.println("After swapping ");
		System.out.print("Arr--> ");		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}
}