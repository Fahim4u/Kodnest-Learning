public class Camera {
	String color;
	String brand;
	int cost;
	//constructor
	public Camera(String x, String y, int z)
	{
		color = x;
		brand = y;
		cost = z;
	}
	void captureImage()
	{
		System.out.println("Image captured in "+color+" color camera which is of "+brand+" brand and cost is Rs "+cost);
	}
	void displayImage()
	{
		System.out.println("Image displayed in "+color+" color camera which is of "+brand+" brand and cost is Rs "+cost);
	}
}
