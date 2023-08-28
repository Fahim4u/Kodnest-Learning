public class BitwiseSwapperTool {
	void swapUsingBitwise(int a, int b)
	{
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;
		System.out.println("After swapping: First = "+a+", Second = "+b);
	}
}
