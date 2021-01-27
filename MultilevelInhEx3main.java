//Example of Multilevel inheritance. Java program to create a class Person having instance variable name
//and create a derived class Employee having instance variable salary
//inherited from Person class, then create a derieved class
//parttimeemployee having instance variable workinghours derived from Employee class.
import java.util.*;
class Person
{
	String name;
	void getpersondata (String name)
	{
		this.name=name;
	}
    void showpersondata()
    {
		System.out.println("name = " + name);
	}
}
//////////////////////////////
class Employee extends Person
{
	float salary;
    void getemployeedata (String name,float salary)
	{
		getpersondata(name);
		this.salary=salary;
	}
    void showemployeedata()
    {
		showpersondata();
		System.out.println("salary = " + salary);
	}
    }
//////////////////////////////////
class parttimeemployee extends Employee
{
	int workinghours;
	void getparttimeemployeedata (String name,float salary,int workinghours)
	{
		getemployeedata(name,salary);
		this.workinghours=workinghours;
	}
    void showparttimeemployeedata()
    {
		showemployeedata();
		System.out.println("working hours = " + workinghours);
	}
}

class MultilevelInhEx3main
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
    	parttimeemployee  emp=new parttimeemployee();
    	System.out.println("enter employee name");
    	String ename=sc.next();
    	System.out.println("enter salary");
    	float sal=sc.nextFloat();
    	System.out.println("enter employee working hours");
    	int whours=sc.nextInt();
		emp.getparttimeemployeedata(ename,sal,whours);
		emp.showparttimeemployeedata();
	}
}
