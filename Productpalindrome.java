class Productpalindrome
{
	public static void main(String[] args)
	{
		int m=1;
		int n=10;
		int prod=1;
		int rev=0;
		for(int i=m;i<=n;i++)
			{
			prod=prod*i;
			}
			System.out.println("product b/w 1 to 10 is:"+prod);
			int temp=prod;
			while(prod!=0)
		{
				int lastdigit=prod%10;
				rev=rev*10+lastdigit;
				prod=prod/10;
		}
		if(rev==temp)
			{
			System.out.println("the product b/w 1 to 10 is a palindrome number");
			}
			else
		   {
		   System.out.println("the product b/w 1 to 10 is not a palindrome number");
           }
    }
}