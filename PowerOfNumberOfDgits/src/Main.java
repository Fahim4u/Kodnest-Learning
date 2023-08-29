import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		ResultCalculator c1 = new ResultCalculator();
		int count = c1.count(n);
		int res = c1.finalRes(n, count);
		System.out.println("Result of "+n+" powered by "+count+" is "+res);
		scan.close();
	}
}
