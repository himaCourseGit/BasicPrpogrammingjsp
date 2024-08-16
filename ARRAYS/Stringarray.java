import java.util.Scanner;
class Stringarray
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many members are there in your family");
		int n=scan.nextInt();
		String [] a=new String[n];
		System.out.println("enter your family memebers names one by one");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=scan.next();
		}
            System.out.println("your family members names are");
            for (int i=0;i<=a.length-1 ;i++ )
         {
	System.out.println(a[i]);
		 }
	}
}
   
		
