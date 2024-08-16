class Sumpalindrome 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=20;
		int rev=0;
		int sum=0;
		for (int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Summation b/w 1 to 20 is:"+sum);
		int temp=sum;
		while(sum!=0)
		{
			int lastdigit=sum%10;
			rev=rev*10+lastdigit;
			sum=sum/10;
		}
		if(rev==temp)
		{
			System.out.println("the summation b/w 1 to 20 is palindrome number");
        }
		else
		{
			System.out.println("the summation b/w 1 to 20  is not a palindrome number");
		}
	}
}
