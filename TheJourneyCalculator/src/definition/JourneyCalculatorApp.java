package definition;
import java.util.Scanner;
public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed and time travelled");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		scan.close();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double res = journeyCalculator.calculateDistance(speed, time);
		System.out.println("Total distance travelled in "+time+" hours is "+res);
	}
}
