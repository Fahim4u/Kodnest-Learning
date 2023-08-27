public class MobileApp {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Purple", 125000);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		m1.allowToCall();
		m1.allowToPlay();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile m2 = new Mobile();
		System.out.println(m2.brand+" "+m2.color+" "+m2.cost);
		m2.allowToCall();
		m2.allowToPlay();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile m3 = new Mobile("MI");
		System.out.println(m3.brand+" "+m3.color+" "+m3.cost);
		m3.allowToCall();
		m3.allowToPlay();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Mobile m4 = new Mobile(50000);
		System.out.println(m4.brand+" "+m4.color+" "+m4.cost);
		m4.allowToCall();
		m4.allowToPlay();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
