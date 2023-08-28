package elseIf;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		Ladder.score(score);
		scan.close();
		}
}
