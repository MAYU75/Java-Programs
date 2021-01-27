//create a base class person(name,address), create a derived class student(rno,marks)
//inherited from person class, then create a derived class parttimestudent(noofhours)
//derived from student class.

import java.util.*;
class Person
{
	String name;
	String address;
	void getpersondata (String name, String address)
	{
		this.name=name;
		this.address=address;
	}
    void showpersondata()
    {
		System.out.println("name = " + name);
		System.out.println("address = " + address);
	}
}
//////////////////////////////
class Student extends Person
{
	int rno,marks;
    void getstudentdata (String name,String address,int rno,int marks)
	{
		getpersondata(name,address);
		this.rno=rno;
		this.marks=marks;
	}
    void showstudentdata()
    {
		showpersondata();
		System.out.println("roll no = " + rno);
		System.out.println("marks = " + marks);
	}
}
//////////////////////////////////
class Parttimestudent extends Student
{
	int noofhours;
	void getparttimestudentdata (String name,String address,int rno,int marks,int noofhours)
	{
		getstudentdata(name,address,rno,marks);
		this.noofhours=noofhours;
	}
    void showparttimestudentdata()
    {
		showstudentdata();
		System.out.println("number of hours = " + noofhours);
	}
}

class MultilevelInhEx4main
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
    	Parttimestudent  stud=new Parttimestudent();
    	System.out.println("enter student name");
    	String sname=sc.next();
    	System.out.println("enter student address");
    	String addr=sc.next();
   	 	System.out.println("enter student roll number");
    	int rollno=sc.nextInt();
    	System.out.println("enter student marks");
    	int mark=sc.nextInt();
    	System.out.println("enter student working hours");
    	int whours=sc.nextInt();
		stud.getparttimestudentdata(sname,addr,rollno,mark,whours);
		stud.showparttimestudentdata();
	}
}


