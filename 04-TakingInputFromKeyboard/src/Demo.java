import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		System.out.println("Enter a real number");
		float b = scan.nextFloat();
		System.out.println("Enter another real number");
		double c = scan.nextDouble();
		System.out.println("Are you married? Enter only true or false");
		boolean d = scan.nextBoolean();
		System.out.println("Enter your gamil id");
		String e = scan.next();
		System.out.println("Enter your full name ");
		scan.nextLine();
		String f = scan.nextLine();
		System.out.println("Value of integer is "+a);
		System.out.println("Value of real number is "+b);
		System.out.println("Value of real number is "+c);
		System.out.println("Married "+d);
		System.out.println("Your gmail id is "+e);
		System.out.println("Full name is "+f);
		scan.close();
	}
}