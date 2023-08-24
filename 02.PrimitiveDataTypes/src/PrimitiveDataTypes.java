public class PrimitiveDataTypes {
	public static void main(String[] args) {
		char a = '!';
		byte b = 127;
		byte c = -128;
		short d = 32767;
		short e = -32768;
		int f = 2147483647;
		int g = -2147483648;
		long h = 9223372036854775807L;
		long i = -9223372036854775808L;
		float j = 1.4E-45f;
		float k = 3.4028235E38F;
		double l = 4.9E-324;
		double m = 1.7976931348623157E308;
		boolean n = true;
		boolean o = false;
		System.out.println("Example of character is "+a);
		System.out.println("Range of byte is from "+b+" to "+c);
		System.out.println("Range of short is from "+d+" to "+e);
		System.out.println("Range of int is from "+f+" to "+g);
		System.out.println("Range of long is from "+h+" to "+i);
		System.out.println("Range of float is from "+j+" to "+k);
		System.out.println("Range of double is from "+l+" to "+m);
		System.out.println("Range of boolean is "+n+" and "+o);
	}
}