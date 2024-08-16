class Magicnumber2
{
	public static void main(String[] args) 
		{
		int num=9878899;
		int sum=0;
		int lastdigit=0;
		while(num>0||sum>9)
			{
			if(num==0)
				{
				num=sum;
				sum=0;
				}
				lastdigit=num%10;
				sum=sum+lastdigit;
				num=num/10;
			}
			if(sum==1){
				System.out.println("magic no");
			}
			else{
				System.out.println("not magic");
			}
	}
}
