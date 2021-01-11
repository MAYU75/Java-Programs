//7) Java program to create a class book having fields bookname,author and price
//and a method getbook with no parameters, overload the getbook method
//with 3 parameters (string, string, float),
//overlaod again getbook method with 3 parameters(string,float,string)

import java.util.*;
class book
{
	String bookname;
	String author;
	float price;
	//creating a method
	public void  getbook()
	{
		bookname="java";
		author="Sanya";
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
	public void show()
	{
		System.out.println("bookname = " + bookname);
		System.out.println("author = " + author   );
		System.out.println("price = " + price);
	}
}

class bookmain7methodoverload
{
	public static void main(String[] args)
	{
		book b1=new book();
		System.out.println("\n");
		System.out.println("book 1 details");
		b1.getbook();
		b1.show();
		book b2=new book();
		System.out.println("\n");
		System.out.println("book 2 details");
		b2.getbook("oracle","mayuri",500.0f);
		b2.show();
		book b3=new book();
		System.out.println("\n");
		System.out.println("book 3 details");
		b3.getbook("python",550.0f,"madhuri");
		b3.show();
	}
}