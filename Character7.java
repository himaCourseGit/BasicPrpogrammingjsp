class Character7
{
	public static void main(String[] args) 
	{
		int character=1;
		int space=3;
		char ch='A';
		for(int i=1;i<=7;i++)
			{
			for(int a=1;a<=space;a++)
			{
			  System.out.print(" "+" ");
			}
			for(int b=1;b<=character;b++)
			{
				System.out.print(ch+++" ");
				if(ch=='A')
				ch=ch++;
			}
			if(i<4)
			{
				space--;
				character=character+2;
			}
			else
			{
				space++;
				character=character-2;
			}
		System.out.println();
		}
	}
}
