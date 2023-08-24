public class MobileApp {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("Samsung", "Purple", 125000);
		System.out.println(mobile1.brand+" "+mobile1.color+" "+mobile1.cost);
		mobile1.allowToCall();
		mobile1.allowToPlay();
		//Below line is error because compiler did not add default constructor 
		//as already one user defined constructor is present in class
		//Mobile mobile2 = new Mobile();
	}
}
