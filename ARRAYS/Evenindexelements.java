import java.util.Scanner;
class Evenindexelements
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements one by one");
		for( int i=0;i<=a.length-1;i++)
			{
			a[i]=scan.nextInt();
			}
			System.out.println("even index elements are:");
			for(int i=0;i<=a.length-1;i++)
			{
				if(i%2==0)
				{
					System.out.println(a[i]);
				}
			}
	}
}
