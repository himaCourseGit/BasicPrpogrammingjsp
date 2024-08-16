class Patternalphabets
{
	public static void main(String[] args) 
	{
		int space=3;
		int character=1;
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for(int b=1;b<=character;b++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
			space--;
			character=character+2;
		} 
	}
}
