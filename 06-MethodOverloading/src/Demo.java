public class Demo {
	public static void main(String[] args) {
	teaBill();
	teaBill("Giner");
	teaBill(10);
	teaBill("Green", 10);
	}
	public static void teaBill()
	{
		System.out.println("Bill for tea is Rs 10");
	}
	public static void teaBill(int n)
	{
		System.out.println("Bill for "+n+" tea is Rs 15");
	}
	public static void teaBill(String type)
	{
		System.out.println("Bill for "+type+" tea is Rs 15");
	}
	public static void teaBill(String type, int n)
	{
		System.out.println("Bill for "+n+" "+type+" tea is Rs "+(n*15));
	}
	//Below method definition gives error. So, we will comment it
	/*public static void teaBill(String type)
	 * {
	 * System.out.println("Bill for "+type+" tea is Rs 15");
	 * return 15;
	 * }*/
}
