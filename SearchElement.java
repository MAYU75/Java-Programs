//6) Java program to search an element in an array. Example of unlabeled break.
class SearchElement
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers= {12,78,88,23,45,345,890,2,5,75};
		int search= 45,i;
		boolean found= false;
		for(i=0;i<arrayOfNumbers.length;i++)
		{
			if(arrayOfNumbers[i] == search)
			{
				found=true;
				break;
			}
		}
	    if(found == true)
	    {
			System.out.println("The number "+ search +" is found at position "+ (i+1));
		}
		else
		{
			System.out.println("The number "+ search +" is not found in the given array");
		}
	}
}
