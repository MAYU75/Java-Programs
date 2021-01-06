//Java program to accept 3 no and display the greater no.
import java.util.Scanner;
class greater3num
{
	public static void main(String args[])
	{
		int num1,num2,num3;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter three numbers for comparision: ");
		num1= n.nextInt();
		num2= n.nextInt();
		num3= n.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println(num1+" is the greatest.");
		else if(num2>num1 && num2>num3)
				System.out.println(num2+" is the greatest.");
			 else
			 	System.out.println(num3+" is the greatest.");
    }
}