class Diamondstar1 
{
	public static void main(String[] args) 
	{
		int star=1;
		int space=2;
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for(int b=1;b<=star;b++)
			{
				System.out.print("*"+" ");
			}
			if(i<3)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
		System.out.println();
		}
	}
}
