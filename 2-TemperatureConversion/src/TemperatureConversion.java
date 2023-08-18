import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option: ");
		System.out.println("1. Convert Celsius to Fahrenheit ");
		System.out.println("2. Convert Fahrenheit to Celsius ");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the temperature in Celsius: ");
			double cel = scan.nextDouble();
			System.out.println(cel+"°C is equivalent to "+TemperatureConversionTool.celsiusToFahrenheit(cel)+"°F");
		}
		else
		{			
			System.out.println("Enter the temperature in Fahrenheit: ");
			double fah = scan.nextDouble();
			System.out.println(fah+"°F is equivalent to "+TemperatureConversionTool.fahrenheitToCelsius(fah)+"°F");
		}
		scan.close();
	}
}