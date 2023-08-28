import java.util.Scanner;
public class Main {
	public static void calculateSum(int n)
	{
		System.out.println(n*(n+1)/2);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		calculateSum(num);
		scan.close();
	}
}