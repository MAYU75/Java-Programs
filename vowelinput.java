//Java program to accept a char from the user and display whether it is vowel or not.
import java.util.Scanner;
class vowelinput
{
	public static void main(String[] args)
	{
	  char ch;
	  Scanner c = new Scanner(System.in);
	  System.out.println("Enter the alphabet to check whether it is vowel or not: ");
	  ch= c.next().charAt(0);
	  switch(ch)
	  {
	    case 'a': System.out.println(ch +" is a vowel" );
	              break;
	    case 'e': System.out.println(ch +" is a vowel");
	              break;
	    case 'i': System.out.println(ch +" is a vowel");
	              break;
	    case 'o': System.out.println(ch +" is a vowel");
	              break;
	    case 'u': System.out.println(ch +" is a vowel");
	              break;
	    default: System.out.println(ch +" is not a vowel");
	   }
	 }
}
