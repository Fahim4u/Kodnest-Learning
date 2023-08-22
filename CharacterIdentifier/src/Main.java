import java.util.Scanner;
public class Main {
	public static void identifyCharacter(char ch)
	{

	// convert the character to a Character object
	Character c = new Character(ch);
	// check if the character is a letter
	if (c.isLetter(ch))
	{
	// check if the character is lower case
	if (c.isLowerCase(ch))
	{
	// check if the character is a vowel
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
	System.out.println("Lower-case vowel");
	}
	else
	{
	System.out.println("Lower-case consonant");
	}
	}
	// check if the character is upper case
	else if (c.isUpperCase(ch))
	{
	// check if the character is a vowel
	if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	{
	System.out.println("Upper-case vowel");
	}
	else
	{
	System.out.println("Upper-case consonant");
	}
	}
	}
	// check if the character is a digit
	else if (c.isDigit(ch))
	{
	System.out.println("Digit");
	}
	// otherwise, the character is a special character
	else
	{
	System.out.println("Special character");
	}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter an ch ");
		char ch = scan.next().charAt(0);
		scan.close();
		identifyCharacter(ch);
	}
}