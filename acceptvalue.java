//Java program to accept byte, short, long, boolean, float, double, char, string value from the user
//and then display it.
import java.util.Scanner;
class acceptvalue
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any byte value: ");
	    int n1 = s1.nextByte();
		System.out.println("The byte value entered by the user: "+n1);
		System.out.println("Enter any short datatype number: ");
		short n2 = s1.nextShort();
		System.out.println("The short number entered by the user: "+n2);
		System.out.println("Enter any long datatype number: ");
 		long n3 = s1.nextLong();
		System.out.println("The long datatype number entered by the user: "+n3);
		System.out.println("Enter any float datatype number: ");
		float n4 = s1.nextFloat();
		System.out.println("The float datatype number entered by the user: "+n4);
		System.out.println("Enter any double datatype number: ");
		double n5 = s1.nextDouble();
		System.out.println("The double datatype number entered by the user: "+n5);
		System.out.println("Enter any boolean datatype value: ");
		boolean b = s1.nextBoolean();
		System.out.println("The boolean value entered by the user: "+b);
		System.out.println("Enter any char datatype value: ");
		char ch = s1.next().charAt(0);
		System.out.println("The char value entered by the user: "+ch);
        System.out.println("Enter any string datatype value: ");
		String strg = s1.next();
		System.out.println("The  string value entered by the user: "+strg);
   }
}