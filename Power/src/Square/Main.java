package Square;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		PowerTwo p1 = new PowerTwo();
		int res = p1.calculate(n);
		System.out.println("Square of "+n+" is "+res);
		scan.close();
	}
}