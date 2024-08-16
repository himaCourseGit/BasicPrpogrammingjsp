class Evensummation 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=5;
		int sum=0;
		for (int i=m;i<=n;i++)
		{
			if(i%2==0)
			sum=sum+i;
		}
		System.out.println("sum of even numbers:"+sum);
	}
}
