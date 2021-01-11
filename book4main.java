//4) Java program to create a class book having fields bookname,author and price and a blank constructor.

class book
{
	String bookname;
	String author;
	float price;
	//creating a blank constructor
	public  book()
	{
		bookname="Java Programming";
		author="Mayuri";
		price=250.00f;
	}
	public void showdata()
	{
		System.out.println("Bookname = " + bookname);
		System.out.println("Author = " + author);
		System.out.println("Price = " + price);
	}
}
class book4main
{
	public static void main(String[] args)
	{
		book b=new book(); // automatically it will call blank constructor
		b.showdata();
	}
}