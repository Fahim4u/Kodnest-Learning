public class CheckPalindrome {
	public void check(int n)
	{
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;
		   sum=(sum*10)+r;    
		   n=n/10;  
		  }
			if(temp == sum)
			{
				System.out.println("true");
				break;
			}
			else
			{
				System.out.println("false");
				break;
			}
	}
}
