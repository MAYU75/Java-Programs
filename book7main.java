//7) Java program to create a class book having fields bookid,bookname,price and author and getdata
//method with 4 parameters and showdata method
import java.util.*;
class book
{
	//Attributes
	private int bookid;
	private String bookname;
	private float price;
	private String author;
	//Methods
	void getdata(int bid,String bname,String bauthor,float bprice)
	{
		bookid = bid;
		bookname = bname;
		author = bauthor;
		price = bprice;
	}
	void showdata()
	{
		System.out.println("Book ID: "+bookid);
		System.out.println("Book Name: "+bookname);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
	}
}

class book7main
{
	public static void main(String[] args)
	{
		book b = new book();
		int bkid;
		String bkname;
		float bkprice;
		String bkauthor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Book ID: ");
		bkid = scan.nextInt();
		System.out.println("Enter the Book Name: ");
		bkname = scan.next();
		System.out.println("Enter the Book Author: ");
		bkauthor = scan.next();
		System.out.println("Enter the Book Price: ");
		bkprice = scan.nextFloat();
		b.getdata(bkid,bkname,bkauthor,bkprice);
		b.showdata();
	}
}