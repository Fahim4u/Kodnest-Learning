public class Demo {
	public static void main(String[] args) {
		//Implicit type casting
		byte a = 10;
		short b;
		b=a;
		System.out.println(b);
		System.out.println(a);
		int c = 30;
		double d = c;
		System.out.println(c);
		System.out.println(d);
		//There is no loss of data 
		//Explicit type casting
		short m = 32;
		byte n;
		// n = m; error - cannot convert from short to byte
		n = (byte)m; //Explicit conversion is done
		System.out.println(m);
		System.out.println(n);
		double o = 3.147;
		int p;
		//p = o; error = Type mismatch: cannot convert from double to int.
		p = (int)o; 
		//there is a loss of data in this conversion
		System.out.println(o);
		System.out.println(p);
	}
}
