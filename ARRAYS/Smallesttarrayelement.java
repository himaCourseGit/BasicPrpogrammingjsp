import java.util.Scanner;
class Smallesttarrayelement
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
	int small=a[0];
	for (int i=0;i<=a.length-1 ;i++ )
	{
		if(a[i]<small)
		{
			small=a[i];
		}
	}
		System.out.println("Smallest element in the array is:"+small);
	}
}

