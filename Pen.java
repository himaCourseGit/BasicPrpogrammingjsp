class Pen 
{
	public void write()
	{
		System.out.println("write on board");
	}
	public void marking()
	{
		System.out.println("mark on book");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Pen obj=new Pen();
		obj.write();
		obj.marking();
		System.out.println("main ends");
	}
}
