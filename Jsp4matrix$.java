class Jsp4matrix$ 
{
	public static void main(String[] args) 
	{
		int rows=3;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i==1)
				{
					System.out.print("*"+" ");
                }
				else if(i==2)
				{
				    System.out.print("$"+" ");
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
