package Com.Kodnest.series.fibonacciSeries;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		checkFibonacciSeries(n);
		scan.close();
	}
	public static void checkFibonacciSeries(int n)
	{
		int num1 = 0;
		int num2 = 1;
		if(n==1)
		{
			System.out.print(num1+" ");
		}
		else if(n ==2)
		{
			System.out.print(num2+" ");
		}
		else
		{
			for(int i = 3; i<=n; i++)
			{
				int num3 = num1+num2;
				num1 = num2;
				num2 = num3;
				if(i==n)
				{
					System.out.println(num3);
				}
			}
		}
	}
}
