class Unitsplace 
{
	public static void main(String[] args) 
	{
		int n=1234;
		while(n!=0)
			{
			int lastdigit=n%10;
			System.out.println(lastdigit);
			n=n/10;
			}
	}
}
