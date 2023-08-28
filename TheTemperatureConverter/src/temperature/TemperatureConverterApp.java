package temperature;
import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature to convert in celsius");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		scan.close();
		System.out.println("Conversion of "+fahrenheit+" degree fahrenheit is "+temperatureConverter.convertFahrenheitToCelsius(fahrenheit)+" degree celsius");
	}
}
