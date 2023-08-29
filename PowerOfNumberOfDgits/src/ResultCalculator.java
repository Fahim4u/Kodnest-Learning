public class ResultCalculator {
	int count(int num)
	{
		int count =0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
	int finalRes(int num, int n)
	{
		int res = 1;
		for(int i=1; i<=n; i++)
		{
			res = res*num;
		}
		return res;
	}
}
