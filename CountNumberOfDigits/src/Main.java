import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		NumberOfDigits n1 = new NumberOfDigits();
		int res = n1.digits(n);
		System.out.println("Number of digits in "+n+" is "+res);
		scan.close();
	}
}