public class Mobile {
	String brand;
	String color;
	int cost;
	public Mobile(String brand, String color, int cost) 
	{
		//Shadowing problem
		//brand = brand;
		//color = color;
		//cost = cost;
		//solution to shadowing problem
		this.brand = brand;
		this.color = color;
		this.cost = cost;	
	}
	void allowToCall()
	{
		System.out.println("Tring Tring.... Calling...");
	}
	void allowToPlay()
	{
		System.out.println("Start playing BGMI..");
	}
}
