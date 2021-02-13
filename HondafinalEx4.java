//Java program Example of Java final class.

final class Bike{}

class HondafinalEx4 extends Bike	//Compile time error.
{
      void run()
      {
		  System.out.println("running safely with 100kmph");
	  }

      public static void main(String args[])
      {
      		HondafinalEx4 honda= new HondafinalEx4();
      		honda.run();
      }
}
