class Humanc 
{
	public Humanc(int weight)
	{
		System.out.println("Human weight"+weight+"in kgs");
	}
	public Humanc(double height)
	{
		this(40);
		System.out.println("Human height:"+height+"in cms");
	}
	public Humanc(String Name,int age)
	{
		this(16.2);
		System.out.println("human Name:"+Name+"with age:"+age+"in years");
	}
	public static void main(String[] args) 
	{
		Humanc humanc1=new Humanc("deakshi",16);
		
	}
}
