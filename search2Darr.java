//10) Java program to search an element in a 2 d array. Example of labeled break statement.
class search2Darr
{
	public static void main(String[] args)
	{
		int[][] arrayOfInt={{15,25,35,45},
							 {55,65,75,85},
							 {95,105,125,135}};
		int search= 125,i,j=0;
		boolean found= false;
		int row= arrayOfInt.length;
		int column= arrayOfInt[0].length;
		System.out.println("Rows= "+ row);
		System.out.println("Columns= "+ column);
		//Creating label named search.
		search: for(i=0;i<row;i++)
				{
					for(j=0;j<column;j++)
					{
						if(arrayOfInt[i][j] == search)
						{
							found= true;
							break search;
						}
				    }
				}
		if(found)
		{
			System.out.println(search + " is found at position " + i + "," + j);
		}
		else
		{
			System.out.println(search + " is not found in the array.");
		}
	}
}