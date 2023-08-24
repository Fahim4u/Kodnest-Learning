public class AdvantagesOfMethods {
	public static void main(String[] args) {
		greet();
		int x = 20;
		int y = 10;
		int res = multi(x,y);
		System.out.println("Multiplication result is "+res);
		int res1 = add(x,y);
		System.out.println("Addition result is "+res1);
		sub();
		mod(x, y);
		boolean res2 = checkGreater(x,y);
		System.out.println(res2);
		int res3 = add(x,y)/2;
		System.out.println("Average is "+res3);
		int res4 = div(x, y);
		System.out.println("Division result is "+res4);
	}
	public static void greet()
	{
		System.out.println("Hello World...");
	}
	public static int add(int x, int y)
	{
		return x+y;
	}
	public static void sub()
	{
		int a = 20;
		int b = 10;
		System.out.println("Subtraction result is "+(a-b));
	}
	public static int div(int m, int n)
	{
		return m/n;
	}
	public static void mod(int a, int b)
	{
		System.out.println("Remainder is "+(a%b));
	}
	public static int multi(int a, int b)
	{
		return a*b;
	}
	public static boolean checkGreater(int x, int y)
	{
		return x>y;
	}
}
