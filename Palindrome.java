class Palindrome 
{
	public static void main(String[] args) 
	{
		int n = 121;
		int temp=n;
        int rev=0;
		while(n!=0)
		{
		    int lastdigit=n%10;
		    rev=rev*10+lastdigit;
			n=n/10;
		}
	if(rev==temp)
	{
     System.out.println("the given number is palindrome number");
	}
	else
	{
		System.out.println("the given number is not a palindrome number");
	}
	}
}
