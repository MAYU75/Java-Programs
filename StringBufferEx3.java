//Java program to demonstrate StringBuffer insert() method
//The insert() method inserts the given string
//with this string at the given position.

import java.util.*;

class StringBufferEx3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String fn=sc.next();
		StringBuffer sb=new StringBuffer(fn);
		System.out.println("enter your lname");
		String ln=sc.next();
	    sb.insert(5,ln);//now original string is changed
	    System.out.println(sb);//prints HJavaello
     }
}
