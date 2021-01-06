//Java program to calculate total , per and grade using if else if.
class calculate
{
	public static void main(String[] args)
	{
		int m1=88,m2=67,m3=98,m4=67,m5=75;
		int total;
		float per;
		total=m1+m2+m3+m4+m5;
		per=(float) (total/5);
		if(per>=75)
		{
		    System.out.println("Grade is Distinction");
	    }
	    else if(per<75 && per>=60)
	         {
				System.out.println("Grade is first division");
	         }
	         else if(per<60 && per>=45)
	    		  {
	    			 System.out.println("Grade is second division");
			      }
			      else
			      {
					  System.out.println("Grade is fail");
			      }
	}
}