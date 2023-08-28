import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		CheckPalindrome check1 = new CheckPalindrome();
		check1.check(n);
		scan.close();
	}
}