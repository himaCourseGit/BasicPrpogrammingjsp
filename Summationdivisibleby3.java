class Summationdivisibleby3 
{
	public static void main(String[] args) 
	{
		int n=369;
		int sum=0;
		while(n!=0)
		{
			int lastdigit=n%10;

			if(lastdigit%3==0)
			{
			sum=sum+lastdigit;
			}
			n=n/10;
		}
		System.out.println("the summation of a given number is:"+sum);
		if(sum%2==0)
		{
		  System.out.println("the summation of given number is even");
		}
		else
		{
			System.out.println("the summation of given number is odd");
		}
	}
}
