class Prime_number 
{
	public static void main(String[] args) 
	{
		//int m=2;
		//int n=100;
		//boolean status=true;
		for (int i=2;i<100;i++)
		{
			int a=i;
			boolean status=true;
			for(int j=2;j<a;j++)
			{
				if(a%j==0)
				{
					status=false;
					break;
				}
		}
		if(status)
			{
		System.out.println(i);
			}
		}
	}
}
