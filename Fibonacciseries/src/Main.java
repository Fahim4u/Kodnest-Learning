import java.util.Scanner;

public class Main {
	public static void printFibonacciSeries(int n)
	{
		int num1 = 0;
		int num2 = 1;
		if(n==1)
		{
			System.out.print(num1+" ");
		}
		else if(n ==2)
		{
			System.out.print(num1+" "+num2);
		}
		else
		{
			System.out.print(num1+" "+num2);
			for(int i=3; i<=n; i++)
			{
				int nextnum = num1+num2;
				System.out.print(" "+nextnum);
				num1 = num2;
				num2 = nextnum;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		printFibonacciSeries(scan.nextInt());
		scan.close();
	}
}
