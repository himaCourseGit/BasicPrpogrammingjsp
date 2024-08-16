class Book
{
	public Book(String subject,double price)
	{
      System.out.println("Book with"+subject+"subject of price"+price+"/-RS");
	}
	public Book(int pages)
	{
      System.out.println("Book with"+pages+"pages");
	}
	public Book(double width)
	{
       System.out.println("book with width"+width+"in cms");
	}
	public static void main(String[] args) 
	{
		Book book1= new Book("english",13.2);
		Book book2=new Book(10);
		Book book3=new Book(20.4);
}
