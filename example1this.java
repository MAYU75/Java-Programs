class book
{
	//creating instance variable
	String bookname;
	//creating a constructor with parameters
	public book(String bookname)
	{
		this.bookname=bookname;
	}
	//creating a method display
	public void display()
	{
		System.out.println("Bookname: " + bookname);
	}
}
//creating a class
class example1this
{
	public static void main(String[] args)
	{
		book b1=new book("java");
		b1.display();
	}
}