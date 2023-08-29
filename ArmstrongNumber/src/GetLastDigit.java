public class GetLastDigit {
	int Armstrong(int num)
	{
		int sum =0;
		int lastDigit = 0;
		
		while(num!=0)
		{
			lastDigit = num%10;
			num= num/10;
			sum = sum+(lastDigit*lastDigit*lastDigit);
		}
		return sum;
	}
}
