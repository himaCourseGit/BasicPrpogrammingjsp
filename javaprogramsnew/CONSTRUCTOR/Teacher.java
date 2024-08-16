class Teacher 
{
	public Teacher()
	{
		System.out.println("teacher teaches java");
	}
	public Teacher(int rating)
	{
		this();
		System.out.println("rating:"+rating);
	}
		public static void main(String[] args) 
	{
		Teacher teacher1=new Teacher(9);
	}
}
