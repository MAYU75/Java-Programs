//1) Java program to accept mon and display the days in that month using switch.
import java.util.Scanner;
class daysDisplay
{
	public static void main(String[] args)
	{
		String month;
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the month: ");
		month= m.next();
		switch(month)
		{
			case "January": System.out.println("Number of days: 31");
							break;
			case "February": System.out.println("Number of days: 28/29");
							break;
			case "March": System.out.println("Number of days: 31");
							break;
			case "April": System.out.println("Number of days: 30");
							break;
			case "May": System.out.println("Number of days: 31");
							break;
			case "June": System.out.println("Number of days: 30");
							break;
			case "July": System.out.println("Number of days: 31");
							break;
			case "August": System.out.println("Number of days: 31");
							break;
			case "September": System.out.println("Number of days: 30");
							break;
			case "October": System.out.println("Number of days: 31");
							break;
			case "November": System.out.println("Number of days: 30");
							break;
			case "December": System.out.println("Number of days: 31");
							break;
			default: System.out.println("You have entered invalid month name.");
		}
	}
}
