class Pattern2 
{
	public static void main(String[] args) 
	{
		int space=3;
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for(int b=1;b<=num;num++)
			{
				System.out.print(num+++" ");
				num=1;
			}
			System.out.println();
			space--;
			num=num+2;
		}
	}
}
