import java.util.Scanner;
class Arrayreverseelements
{
public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int n=scan.nextInt();
		int [] a=new int[n];
		System.out.println("enter array elements one by one");
		for (int i=0;i<=a.length-1;i++)
	{
			a[i]=scan.nextInt();
	}
	System.out.println("array elements in reverse order are:");
	for (int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]);
		}
	}

}
