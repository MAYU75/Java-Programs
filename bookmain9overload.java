//9) Java program for example of book class having constructor and method overloading
class book
{
	String bookname;
	String author;
	float price;
	//creating a constructor
	public book()
	{
		bookname="html";
		author="priti";
		price=300.00f;

	}
	//creating a method
	public void getbook()
	{
		bookname="java";
		author="sanya";
		price=200.00f;

	}
	//overloading the method getbook
	public void getbook(String bn,String au,float pr)
	{
		bookname=bn;
		author=au;
		price=pr;
	}
	//overloading the method getbook
	public void getbook(String bn,float pr,String au)
	{
		bookname=bn;
		author=au;
		price=pr;
	}
	public void showdata()
	{
		System.out.println("Bookname = " + bookname);
		System.out.println("Author = " + author   );
		System.out.println("Price = " + price);
	}
}
class bookmain9overload
{
	public static void main(String[] args)
	{
		book b=new book(); // automatically it will call constructor without parameters
		System.out.println();
		System.out.println("book 1 details");
		b.showdata();
		System.out.println("\n");
		System.out.println("book 2 details");
		b.getbook();
		b.showdata();
		book b1=new book();
		System.out.println("\n");
		System.out.println("book 3 details");
		b1.getbook("oracle","mayuri",500.0f);
		b1.showdata();
		book b2=new book();
		System.out.println("\n");
		System.out.println("book 4 details");
		b2.getbook("python",500.0f,"ankita");
		b2.showdata();
		System.out.println();
	}
}