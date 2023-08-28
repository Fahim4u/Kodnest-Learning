	import java.util.Scanner;
	public class Method 
	{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your first number");
			int x = scan.nextInt();
			System.out.println("Enter your second number");
			int y = scan.nextInt();
			System.out.println("Enter your third number");
			int z = scan.nextInt();
			boolean tr = true;
			boolean fl = false;
			scan.nextLine();
			System.out.println("Enter your full name");
			String st = scan.nextLine();
			System.out.println("Your name is "+st);
			System.out.println("Hello! "+"How are you?");
			int res = add(x,y);
			System.out.println("Addition result is "+res);
			operators(x,y);
			comparision(x,y,z);
			logical_Operators(tr, fl);
			unary_Operator(x);
			data_Type();
			scan.close();	}
		public static int add(int a, int b)
		{
			int c = a+b;
			return c;
		}
		public static void operators(int c, int d)
		{
			System.out.println("Addition result is "+(c+d));
			System.out.println("Substraction result is "+(c-d));
			System.out.println("Multiplication result is "+(c*d));
			System.out.println("Division (gives quotient) result is "+(c/d));
			System.out.println("Divison (gives remainder) result is "+(c%d));
		}
		public static void comparision(int e, int f, int g)
		{
			System.out.println("Is e equals to f? "+(e==f));
			System.out.println("Is e not equal to g? "+(e!=g));
			System.out.println("Is e greater than g? "+(e>g));
			System.out.println("Is f less than g? "+(f<g));
			System.out.println("Is g greater than or equal to f? "+(g>=f));
			System.out.println("Is e less than or equal to f? "+(e<=f));
		}
		public static void logical_Operators(boolean tr, boolean fl)
		{
			System.out.println(tr&&fl);
			System.out.println(fl||tr);
		}
		public static void unary_Operator(int h)
		{
			/*here if I am not storing the value after incrementation, how is the value changed each time in the output*/
			h++;
			System.out.println("Pre incrementaion value of x is "+h);
			++h;
			System.out.println("Post incrementaion value of x is "+h);
			h--;
			System.out.println("Pre decrementation value of x is "+h);
			--h;
			System.out.println("Post decrementaiotion value of x is "+h);
		}
		public static void data_Type()
		{
			Scanner data = new Scanner(System.in);
			System.out.println("Enter a character");
			char aa = data.next().charAt(0);
			System.out.println("The entered character is "+aa);
			System.out.println("Enter a number between -128 to +127");
			byte ab = data.nextByte();
			System.out.println("Positive character value is "+ab);
			System.out.println("Enter a number between -32768 to +32767");
			short ac = data.nextShort();
			System.out.println("The value is "+ac);
			System.out.println("Enter a number between -214783648 to +2147483647");
			int ad = data.nextInt();
			System.out.println("The value is "+ad);
			System.out.println("Enter a number between -9223372036854775808L to +9223372036854775807");
			long ae = data.nextLong();
			System.out.println("The value is "+ae);
			System.out.println("Enter a real number upto 7 decimal places");
			float af = data.nextFloat();
			System.out.println("The value is "+af);
			System.out.println("Enter a real number upto 15 decimal places");
			double ag = data.nextDouble();
			System.out.println("The value is "+ag);
			System.out.println("Enter any one of the true or false");
			boolean ah = data.nextBoolean();
			System.out.println("The value is "+ah);
			data.close();
		}
	}

