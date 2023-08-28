package Construct;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your college marks");
		int marks = scan.nextInt();
		Check check = new Check();
		check.Techclub(marks);
		scan.close();
	}
}