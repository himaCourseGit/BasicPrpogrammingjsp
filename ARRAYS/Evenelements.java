import java.util.Scanner;
class Evenelements
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
			System.out.println("enter array size");
             int n=scan.nextInt();
			 int[] a=new int[n];
		System.out.println("Enter array elements one by one");
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("even elements are:");
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
		{
				System.out.println(a[i]);
		}
	}
	}
}
