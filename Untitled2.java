class Arrowstar1
{
	public static void main(String[] args) 
	{
		int star=1;
		for(int i=1;i<=7;i++)
		{
			for(int b=1;b<=star;b++)
			{
					System.out.print("*"+" ");
			}
			if(i<4)
				star=star+1;
			}
			else
			{
				star=star-1;
			}
			System.out.println();
	}
	}
}
