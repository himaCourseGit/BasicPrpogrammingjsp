class Alphabetspattern 
{
	public static void main(String[] args) 
	{
		int num=5;
		int space=0;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for(int b=1;b<=num;b++)
			{
				System.out.print(n+++" ");
			}
			System.out.println();
			num=num-2;
			space++;
		}
	}
}
