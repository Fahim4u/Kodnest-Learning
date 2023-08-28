import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number which you want to double");
		int num = scan.nextInt();
		scan.close();
		System.out.println("The double of the number that you have entered is "+doubleTheNumber(num));
		
	}
	public static int doubleTheNumber(int num)
	{
		return 2*num;
	}
}
