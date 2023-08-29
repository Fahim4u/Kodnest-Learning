import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter the power of "+num);
		int n = scan.nextInt();
		PowerToN p1 = new PowerToN();
		System.out.println(num+" to the power of "+n+" is "+p1.power(num, n));
		scan.close();
	}
}
