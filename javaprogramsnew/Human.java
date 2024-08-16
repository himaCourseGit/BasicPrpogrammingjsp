class Human 
{
	public static void read()
	{
		System.out.println("reading starts!");
         write();
         Human human1=new Human;
		 Human human2=new Human;
         human1.walk();
		 human2.walk();
		System.out.println("reading ends!");
	}
	public static void write()
	{
        System.out.println("writing starts");
		System.out.println("writing ends");
	}
	public void walk()
	{
        System.out.println("walking starts");
		System.out.println("walking ends");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
          read();
		System.out.println("main ends");
	}
}
