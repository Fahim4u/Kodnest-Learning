import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		scan.close();
		System.out.println("The sum of two numbers is "+galacticAddition(num1, num2));
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
