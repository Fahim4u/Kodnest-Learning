import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double taxRate = scan.nextDouble();
		TaxCalculatorTool T1 = new TaxCalculatorTool();
		scan.close();
		System.out.println("Total cost including tax: "+T1.calculateTotalWithTax(purchaseAmount, taxRate));
	}
}
