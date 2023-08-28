import java.util.Scanner;
public class LogicalOperatorValidator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean input1 = scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false)");
		boolean input2 = scan.nextBoolean();
		LogicalOperatorValidatorTool input = new LogicalOperatorValidatorTool();
		boolean res = input.isValidInput(input1, input2);
		scan.close();
		if (res == true)
		{
			System.out.println("Input is valid");
		}
		else
		{
			System.out.println("Input is invalid");
		}
	}
}