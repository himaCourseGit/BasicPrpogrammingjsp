class Summationofevendigits 
{
	public static void main(String[] args) 
	{
		int n=246;
		int sum=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			if(lastdigit%2==0)
			{
				sum=sum+lastdigit;
			}
			n=n/10;
        }
		System.out.println("the summation of even digits in a given number is:"+sum);
	}
}
