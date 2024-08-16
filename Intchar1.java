class Intchar1 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((j==1||j==3)&&(i==1||i==2||i==3||i==4))
				{
					System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(n+++" ");
				}
			}
		System.out.println();
		}
	}
}
