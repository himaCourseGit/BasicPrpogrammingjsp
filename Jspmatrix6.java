class Jsp6matrix 
{
	public static void main(String[] args) 
	{
		int rows=3;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==3)
				{
					System.out.print("H"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
		System.out.println();
		}
	}
}
