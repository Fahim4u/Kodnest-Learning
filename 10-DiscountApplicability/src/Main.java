import java.util.Scanner;

public class Main {
public static void checkDiscount(double purchaseAmount)
{
	if(purchaseAmount >100)
	{
		System.out.println("Discount Applicable");
	}
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main.checkDiscount(scan.nextDouble());
		scan.close();
	}
}
