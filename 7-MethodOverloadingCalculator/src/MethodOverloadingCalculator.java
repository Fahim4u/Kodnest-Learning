import java.util.Scanner;
public class MethodOverloadingCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		MethodOverloadingCalculatorApp cal = new MethodOverloadingCalculatorApp();
		System.out.println("Enter the operator (+, -, *, /): ");
		char c = scan.next().charAt(0);
		scan.close();
		switch (c) {
        case '+':
           System.out.println("Result: "+cal.calculate(num1, num2));
            break;
        case '-':
            System.out.println("Result: "+cal.calculate(num1, (double)num2));
            break;
        case '*':
            System.out.println("Result: "+cal.calculate((double)num1, num2));
            break;
        case '/':
            System.out.println("Result: "+cal.calculate((double)num1, (double)num2));
            break;
        default:
            System.out.println("Invalid operator");
            return;
		}
	}
}
