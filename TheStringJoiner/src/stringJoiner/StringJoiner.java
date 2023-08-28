package stringJoiner;

import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String str1 = scan.next();
		System.out.println("Enter your last name ");
		String str2 = scan.next();
		System.out.println("Your full name is "+joinStrings(str1, str2));
		scan.close();
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
