class Watch 
{
	public static void showTime()
	{
		System.out.println("2:30pm");
	}
	public static void changeTime()
	{
		System.out.println("time is changed from 2:30pm to 3:00pm");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		showTime();
		changeTime();
		System.out.println("main ends");
	}
}
