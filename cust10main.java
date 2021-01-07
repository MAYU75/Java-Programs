//10) Java program to create a class customer having fields custid,custname,address and emailid
//and getdata method and showdata method without parameters.
import java.util.*;
class customer
{
	int custid;
	String custname;
	String address;
	String emailid;
	void getdata()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the customer ID: ");
		custid = scan.nextInt();
		System.out.println("Enter the customer Name: ");
		custname = scan.next();
		System.out.println("Enter the customer Address: ");
		address = scan.next();
		System.out.println("Enter the customer Email ID: ");
	    emailid = scan.next();
	}
	void showdata()
	{
		System.out.println("Customer ID: "+custid);
		System.out.println("Customer Name: "+custname);
		System.out.println("Customer Address: "+address);
		System.out.println("Customer Email ID: "+emailid);
	}
}

class cust10main
{
	public static void main(String[] args)
	{
		customer c = new customer();
	    c.getdata();
	    c.showdata();
	}
}
