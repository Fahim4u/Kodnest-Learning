public class MobileApp {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Purple", 125000);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		Mobile m2 = new Mobile("Apple", "Gold", 250000);
		System.out.println(m2.brand+" "+m2.color+" "+m2.cost);
	}
}