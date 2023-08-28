import java.util.Scanner;
public class BitwiseBitCounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		scan.close();
		CountSetBitsTool countSetBitsTool = new CountSetBitsTool();
		System.out.println("Number of set bits: "+countSetBitsTool.countSetBits(num));		
	}
}
