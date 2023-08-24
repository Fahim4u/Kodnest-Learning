public class Type2 {
	public static void main(String[] args) {
		//Method which would not accept any parameter and would return a value.
		int res = add();
		System.out.println("Addition result is "+res);
	}
	public static int add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
}
