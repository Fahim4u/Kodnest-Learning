package com.kodnest.java.arrays1;
public class PrintArray {
	void printArray(int arr[])
	{
		System.out.print("Array contents in the forward direction are: ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Array contents in the reverse direction are: ");
		int arrRev[] = new int [arr.length];
		for(int i=0; i<=arr.length-1; i++)
		{
			arrRev[i] = arr[arr.length-1-i];
		}
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arrRev[i]+" ");
		}
	}
}