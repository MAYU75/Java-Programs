//Java program Example of Java final method.

class Bike
{
      final void run()
      {
		  System.out.println("running");
	  }
}

class HondafinalEx3 extends Bike
{
       void run()
       {
		   System.out.println("running safely with 100kmph");
	   }
       public static void main(String args[])
       {
       		HondafinalEx3 honda= new HondafinalEx3();
       		honda.run(); //Compile time error.
       }
}
