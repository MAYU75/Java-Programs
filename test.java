//2) Java program to create a class employee having fields empno and empname.
class employee
{
	int empno;
	String empname;
}

class test
{
	public static void main(String[] args)
	{
		employee e1 = new employee();
		employee e2 = new employee();
		e1.empno= 01;
		e1.empname= "Mayuri";
		System.out.println("First Employee number: " + e1.empno);
		System.out.println("First Employee name: " + e1.empname);
		System.out.println("------------------------------------------");
		e2.empno= 02;
		e2.empname= "Madhuri";
		System.out.println("Second Employee number: " + e2.empno);
		System.out.println("Second Employee name: " + e2.empname);
	}
}
