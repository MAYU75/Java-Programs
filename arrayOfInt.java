//7) Java program to create an array of integers, put some values in the array, and print each value
//to standard output.
class arrayOfInt
{
	public static void main(String[] args)
	{
		int[] arrayInt= {23,25,12,75,34};
		System.out.println("Printing the elements of the given array: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arrayInt[i]);
		}
	}
}