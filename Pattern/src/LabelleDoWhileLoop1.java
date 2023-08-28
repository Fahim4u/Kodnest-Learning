public class LabelleDoWhileLoop1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n=1;
		int m=1;
		tamanna: do
		{
			rajini: do
			{
				System.out.print("* ");
				m++;
				break tamanna;
			}while(m<=5);
			//Unreachable code
			/*System.out.println();
			    n++*/
		}while(n<=5);
	}
}
