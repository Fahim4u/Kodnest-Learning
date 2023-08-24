public class Calculator {
	//Instance variable / Data member 
	int num1;
	int num2;
	
	void add()
	{
		//Local variable 
		int res1;
		res1 = num1 + num2;
		System.out.println("Addition result is "+res1);
	}
	void sub()
	{
		int res2 = num1-num2;
		System.out.println("Subtraction result is "+res2);
	}
	void mul()
	{
		int res3 = num1*num2;
		System.out.println("Multiplcation result is "+res3);
	}
	void div()
	{
		int res4= num1/num2;
		System.out.println("Division result is "+res4);
	}
}
