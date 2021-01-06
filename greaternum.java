//Java program to accept 2 no. and display the greater no.
import java.util.Scanner;
class greaternum
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter two numbers to compare: ");
		num1= n.nextInt();
		num2= n.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
	    }
	    else
	    {
			System.out.println(num2+" is greater than "+num1);
	    }
    }
}