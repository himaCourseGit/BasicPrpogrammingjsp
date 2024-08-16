class Spynumber 
{
	public static void main(String[] args) 
	{
		int n=123;
		int sum=0;
		int prod=1;
		while(n!=0)
		{
			int lastdigit=n%10;
			sum=sum+lastdigit;
			prod=prod*lastdigit;
			n=n/10;
		}
		if (sum==prod)
		{
			System.out.println("spy number");
		}
	    else
        {
		System.out.println("not a spy number");
		}
	}
}
