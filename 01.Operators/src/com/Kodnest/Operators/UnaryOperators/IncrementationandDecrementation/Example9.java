package com.Kodnest.Operators.UnaryOperators.IncrementationandDecrementation;
public class Example9 {
	public static void main(String[] args) {
		int a = 10;
		int b;
		b = a++ + a++;
		System.out.println(a);
		System.out.println(b);
	}
}