class Marker 
{
	public void write()
	{
		System.out.println("write on board");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
        Marker obj=new Marker();
		obj.write();
		System.out.println("main ends");
	}
}
