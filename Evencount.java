class Evencount 
{
	public static void main(String[] args) 
	{
		int n=1234;
		int counteven=0;
		while(n!=0)
		{
			if((int lastdigit=n%10)||(n%2==0))
				counteven++;
			    n=n/10;
		}
		System.out.println("the evencount of a digits present in a number:"+counteven);
	}
}
