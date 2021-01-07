//8) Java program to create a class customer having fields custid,custname,address and emailid
//and getdata method with 4 parameters and showdata method
import java.util.*;
class customer
{
	private int custid;
	private String custname;
	private String address;
	private String emailid;
	void getdata(int cid,String cname,String caddress, String cemailid)
	{
		custid = cid;
		custname = cname;
		address = caddress;
		emailid = cemailid;
	}
	void showdata()
	{
		System.out.println("Customer ID: "+custid);
		System.out.println("Customer Name: "+custname);
		System.out.println("Customer Address: "+address);
		System.out.println("Customer Email ID: "+emailid);
	}
}

class cust8main
{
	public static void main(String[] args)
	{
		customer c = new customer();
		int ctid;
		String ctname;
		String ctaddress;
	    String ctemailid;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the customer ID: ");
	    ctid = scan.nextInt();
	    System.out.println("Enter the customer Name: ");
	    ctname = scan.next();
	    System.out.println("Enter the customer Address: ");
	    ctaddress = scan.next();
	    System.out.println("Enter the customer Email ID: ");
	    ctemailid = scan.next();
	    c.getdata(ctid,ctname,ctaddress,ctemailid);
	    c.showdata();
	}
}
