import java.util.Scanner;
public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int a = scan.nextInt();
		System.out.println("Enter the second integer:");
		int b = scan.nextInt();
		scan.close();
		BitwiseSwapperTool Bitwise = new BitwiseSwapperTool();
		Bitwise.swapUsingBitwise(a, b);
	}

}
