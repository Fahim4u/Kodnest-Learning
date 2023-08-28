import java.util.Scanner;
public class Main {
	public static void findGCD(int a, int b)
	{
		int res; 
		while (b != 0) 
		{ 
			res = b; 
			b = a % b; 
			a = res; 
		} 
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		findGCD(num1, num2);
		scan.close();
	}
}