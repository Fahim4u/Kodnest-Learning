import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check it is Armstrong or not");
		int num = scan.nextInt();
		GetLastDigit c1 = new GetLastDigit();
		int sum = c1.Armstrong(num);
		if(sum == num)
		{
			System.out.println("Entered number is a Armstrong number");
		}
		else
		{
			System.out.println("Entered number is not a Armstrong number");
		}
		scan.close();
	}
}