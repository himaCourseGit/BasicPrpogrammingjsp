import java.util.Scanner;
class Largestarrayelement
{
public static void main(String[] args) 
	{
	Scanner scan =new Scanner(System.in);
	System.out.println("eneter array size");
	int n=scan.nextInt();
	int[] a=new int[n];
	System.out.println("eneter array elements one by one:");
	for (int i=0;i<=a.length-1;i++)
	{
		a[i]=scan.nextInt();
	}
	int large=0;
	for (int i=0;i<=a.length-1 ;i++ )
	{
		if(a[i]>large)
		{
			large=a[i];
		}
	}
		System.out.println("Largest element in the array is:"+large);
	}
}
