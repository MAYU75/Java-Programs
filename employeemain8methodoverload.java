//8) Java program to create a class employee having fields empname,designation and salary
//and a method getemployee with no parameters, overload the getemployee method
//with 3 parameters (string, string, float),
//overlaod again getemployee method with 3 parameters(string,float,string)

class employee
{
	String empname,designation;
	float salary;
	//method getemployee with no parameters
	public void getemployee()
	{
		empname= "Mayuri";
		designation= "Software Developer";
		salary= 30000.00f;
	}
	//Overloading method getemployee with 3 parameters (string, string, float)
	public void getemployee(String ename,String edesig,float esal)
	{
		empname= ename;
		designation= edesig;
		salary= esal;
	}
	//Overloading method getemployee with with 3 parameters(string,float,string)
	public void getemployee(String ename,float esal,String edesig)
	{
		empname= ename;
		salary= esal;
		designation= edesig;
	}
	void showdata()
	{
		System.out.println("Employee name: "+ empname);
		System.out.println("Employee designation: "+ designation);
		System.out.println("Employee salary: "+ salary);
	}
}

class employeemain8methodoverload
{
	public static void main(String[] args)
	{

		employee e1 = new employee();
		System.out.println();
		System.out.println("Employee 1 details:");
		e1.getemployee();
		e1.showdata();
		employee e2 = new employee();
		System.out.println();
		System.out.println("Employee 2 details:");
		e2.getemployee("Shital","Manager",25000.00f);
		e2.showdata();
		employee e3 = new employee();
		System.out.println();
		System.out.println("Employee 3 details:");
		e3.getemployee("Priya","Developer",25000.00f);
		e3.showdata();
		System.out.println();
	}
}