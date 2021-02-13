//Java program Example of Java final method.
//final method is inherited but you cannot override it.

class Bike
{
      final void run()
      {
		  System.out.println("running...");
	  }
}

class HondafinalEx5 extends Bike
{
       public static void main(String args[])
       {
       		 new HondafinalEx5().run();
       }
}
