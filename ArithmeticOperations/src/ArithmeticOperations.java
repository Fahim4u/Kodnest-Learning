import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first the larger number for substractor");
		int num1 = scan.nextInt();
		System.out.println("Enter smaller number for substraction");
		int num2 = scan.nextInt();
		System.out.println("The result of substraction is "+subtractNumbers(num1, num2));
		System.out.println("Enter two numbers for multiplication");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result of multiplicaation is "+multiplyNumbers(num1, num2));
		System.out.println("Enter two numbers for division");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result of division is "+divideNumbers(num1, num2));
		System.out.println("Enter two numbers to get their remainder result");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("The result of remainder is "+findRemainder(num1, num2));
		scan.close();
		
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
