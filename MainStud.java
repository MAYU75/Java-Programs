//5) Java program to create a class student having fields rno and name and methods getdata() and showdata().
import java.util.*;
class student
{
	//properties or attributes
	int rno;
	String name;
	//methods
	void getdata()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the student: ");
		rno= scan.nextInt();
		System.out.println("Enter the name of the student: ");
		name= scan.next();
	}
	void showdata()
	{
		System.out.println("Roll number of the student: " + rno);
		System.out.println("Name of the student: " + name);
	}
}

class MainStud
{
	public static void main(String[] args)
	{
		student s1 = new student();
		s1.getdata();
		s1.showdata();
	}
}
