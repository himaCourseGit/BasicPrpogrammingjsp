class Summationpalindromespy 
{
	public static void main(String[] args) 
	{
		int n=12345;
		int temp1=n;
		int sumofevendigits=0;
		while(n!=0);
		{
			int lastdigit=n%10;
			if(lastdigit%2==0)
			{
				sumofevendigits=sumofevendigits+lastdigit;
			}
			n=n/10;
		}
		int temp=sumofevendigits;
		int rev=0;
		while(sumofevendigits!=0)
		{
			int lastdigit=sumofevendigits%10;
			rev=rev*10+lastdigit;
			sumofevendigits=sumofevendigits/10;
		}
		if (temp==rev)
		{
			System.out.println("summation is palindrome");
		}
		else
		{
		System.out.println("Summation is not a palindrome");
		}
		int sumofdigits=0;
	    int prodofdigits=1;
		while(temp1!=0)
		{
			int lastdigit=temp1%10;
			sumofdigits=sumofdigits+lastdigit;
			prodofdigits=prodofdigits*lastdigit;
			temp1=temp1/10;
		}
		if (sumofdigits==prodofdigits)
		{
			System.out.println("spynumber");
		}
		else
		{
			System.out.println("Not a spy number");
		}
	}
}
