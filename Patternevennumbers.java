class Patternevennumbers 
{
	public static void main(String[] args) 
	{
		int n=2;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(n+++" ");
					if(n%2==0)
					n=n+2;
				else
				{
					System.out.print(" "+" ");
				}
				}
			}
		System.out.println();
		}
	}
}
