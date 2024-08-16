import java.util.Scanner;
class Summationofarrayelements
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
	
	int sum=0;
	for (int i=0;i<=a.length-1;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("array elements in summation of elements are:");
	}

}

	
