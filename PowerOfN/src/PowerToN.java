public class PowerToN {
	int power(int num, int n)
	{
		int finalRes = 1;
		for(int i=1; i<=n; i++)
		{
			finalRes = finalRes*num;
		}
		return finalRes;
	}
}
