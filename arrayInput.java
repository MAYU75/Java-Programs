//8) Java program to create an array of integers, accept values from the user in the array,
//and print each value to standard output.
import java.util.Scanner;
class arrayInput
{
	public static void main(String[] args)
	{
		int i;
		int[] array = new int[7];
		//Accepting elements of the array from the user.
		System.out.println("Enter the elements in the array: ");
		Scanner s = new Scanner(System.in);
		for(i=0;i<7;i++)
		{
			array[i]= s.nextInt();
		}
		//Displaying the elements of the array.
		System.out.println("Following are the elements entered in the array:");
		for(i=0;i<7;i++)
		{
			System.out.println(array[i]);
		}
	}
}