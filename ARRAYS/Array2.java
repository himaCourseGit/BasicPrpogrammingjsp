import java.util.Scanner;
class Array2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[] subject=new int[6];
		System.out.println("Enter marks one by one");
		for (int i=0;i<=subject.length-1 ;i++ )
		{
			subject[i]=scan.nextInt();
		}
		System.out.println("marks obtained:");
		for(int i=0;i<=subject.length-1;i++)
		{
			System.out.println(subject[i]);
		}
		System.out.println("size of the array is:"+subject.length);
	}
}
