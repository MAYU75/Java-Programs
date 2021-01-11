//6) Java program to create a class employee having fields empname,designation and salary and
//a blank constructor and constructor with 3 parameters.(Example of constructor overloading)

class employee
{
	String empname,designation;
	float salary;
	//creating a blank constructor
	public employee()
	{
		empname="Mayuri";
		designation="Software developer";
		salary=30000.00f;
	}
	//creating parameterized constructor
	public employee(String ename,String edesig, float sal)
	{
		empname=ename;
		designation=edesig;
		salary=sal;
	}
	public void showdata()
	{
		System.out.println("Employee name: "+empname);
		System.out.println("Employee desination: "+designation);
		System.out.println("Employee salary: "+salary);
	}
}

class empmain
{
	public static void main(String[] args)
	{
		employee e1 = new employee(); //blank constructor automatically called.
		System.out.println("Employee 1 details");
		e1.showdata();
		employee e2 = new employee("Shital","Developer",25000.00f);
		System.out.println("\n");
		System.out.println("Employee 2 details");
		e2.showdata();
	}
}