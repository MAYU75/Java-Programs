//9) Java program to create a 2d array of 3 rows and 3 cols.
import java.util.Scanner;
class Arr2D
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements in the 2D array(3x3): ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]= s.nextInt();
			}
		}
		System.out.println("Display the elements in the 2D array(3x3): ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}