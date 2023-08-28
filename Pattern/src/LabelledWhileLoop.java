public class LabelledWhileLoop {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n = 1;
		rajini:while(n <=5)
		{
			int m = 1;
			tamanna:while(m<=5)
			{
				System.out.print("* ");
				m++;
				break rajini;
			}
			n++;
			System.out.println();
		}
	}
}