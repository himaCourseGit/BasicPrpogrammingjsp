class Perfectsquare 
{
	public static void main(String[] args) 
	{
		int n=4;
		boolean status=false;
		for(int i=1;i<n;i++)
		{
			if(i*i==n)
			{
				status=true;
				break;
			}
        }
		if(status)
		{
			System.out.println("the given number is a perfect square number");
		}
		else
		{
		System.out.println("the given number is not a perfect square number");
		}
	}
}
