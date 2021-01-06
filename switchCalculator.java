//Java program to accept 2 no. and and operator like +,-,* from the user
//and then dipslay the result using switch.
import java.util.Scanner;
class switchCalculator
{
	public static void main(String[] args)
	{
		int num1,num2,result;
		char op;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter two numbers to perform one of the operation: ");
		num1= n.nextInt();
		num2= n.nextInt();
		System.out.println("Enter your choice to perform one of the operation (+,-,*): ");
		op= n.next().charAt(0);
		switch(op)
		{
			case '+': result=num1+num2;
					  System.out.println("The addition of two entered number is "+result);
					  break;
			case '-': result=num1-num2;
					  System.out.println("The subtraction of two entered number is "+result);
					  break;
			case '*': result=num1*num2;
					  System.out.println("The multiplication of two entered number is "+result);
					  break;
			default: System.out.println("You have entered wrong choice for the operation.");
	    }
    }
}