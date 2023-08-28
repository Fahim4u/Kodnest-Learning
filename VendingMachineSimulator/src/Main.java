import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01": System.out.println("Coca Cola");
		break;
		case "P02": System.out.println("Pepsi");
		break;
		case "P03": System.out.println("Fanta");
		break;
		case "P04": System.out.println("Jal Jeera");
		break;
		case "P05": System.out.println("Mountain Dew");
		break;
		case "P06": System.out.println("Boat Guava");
		break;
		default: System.out.println("Panaka");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter code of your product");
		String code = scan.next();
		getProduct(code);
		scan.close();
	}
}
