class Magicnumber 
{
	public static void main(String[] args) 
	{
		int num=55;
		int sum=0;
		int rem=0;
		while(num>9){
			while(num>0)
			{
				rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		if(num==1)
		{
			System.out.println("magic");
		}
		else
		{
			System.out.println("notmagic");
		}
	}
}
