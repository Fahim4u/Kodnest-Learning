public class LebelledDoWhileLoop2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i =1;
		int j =1;
		rohan:do
		{
			sohan:do
			{
				System.out.print("Kodnest ");
				j++;
				break rohan;
			}while(j<=5);
			//below code is unreachable code
			//System.out.println();
			//i++;
		}while(i<=5);
	}
}
