//Java program to accept integer value from the user and then display it.
import java.util.Scanner;
class intvalue
{
	public static void main(String[] args)
	{
		//Class: it is a blue print which describe characteristics and behaviour of a living or
		//non living thing.
		//Object: an instance of a class is called object.
		//Syntax to create object of class
		//<classname> objectname = new <classname>();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any number: ");
		//nextInt() method reads the number provided using keyboard.
		int num = s1.nextInt();
		//Closing Scanner after the use.
		s1.close();
		//Displaying the number
		System.out.println("The number entered by the user: "+num);
    }
}