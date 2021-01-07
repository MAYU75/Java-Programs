//3) Java program to create a class student having fields rno and name and accept the values from
//the user.
import java.util.*;
class student
{
	int rno;
	String name;
}

class studmain
{
	public static void main(String[] args)
	{
		student s1 = new student();
		//Accepting values from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter roll number of the student: ");
		s1.rno = scan.nextInt();
		System.out.println("Enter name of the student: ");
		s1.name = scan.next();
		//Displaying the accepted values.
		System.out.println("Displaying the entered data: ");
		System.out.println("Roll number of the student: "+ s1.rno);
		System.out.println("Name of the student: "+ s1.name);
	}
}