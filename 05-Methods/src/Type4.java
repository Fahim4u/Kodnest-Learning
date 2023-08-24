public class Type4 {
	public static void main(String[] args) {
		//Method which would accept parameters and would return a value.
		int a = 10;
		int b = 20;
		int res = add(a,b);
		System.out.println("Addition result is "+res);
	}
	public static int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
}
