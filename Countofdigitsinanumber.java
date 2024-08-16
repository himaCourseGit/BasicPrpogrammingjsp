class Countofdigitsinanumber 
{
	public static void main(String[] args) 
	{
		int n=1234;
		int count=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			{
				count++;
            }
			n=n/10;
        }
	System.out.println("the count of the digits present in a given number is:"+count);
	}
}
