class Phonenumber 
{
	public static void main(String[] args) 
	{
		long n=9845789765l;
		long sumofdigits=0;
		while(n!=0)
		{
			long lastdigit=n%10;
			sumofdigits=lastdigit+sumofdigits;
			n=n/10;
		}
		long temp=sumofdigits;
		long rev=0;
		if(sumofdigits%2==0)
		{
			while (sumofdigits!=0)
			{
				long lastdigit=sumofdigits%10;
				rev=rev*10+lastdigit;
				sumofdigits=sumofdigits/10;
			}
			if(temp==rev)
			{
				System.out.println("sum is even &palindrome");
			}
			else
			{
		       System.out.println("sum is not a palindrome");
			}
		}
		else
		{
			System.out.println("sum is odd");
		}
	}
}
