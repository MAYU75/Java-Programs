//Java program Example of final variable.

class finalEx2
{
     final int speedlimit;//final variable
     finalEx2()
     {
		 speedlimit=20;
	 }
     void run()
     {
      //speedlimit=400;
      System.out.println(speedlimit);
     }
     public static void main(String args[])
     {
     finalEx2 obj=new  finalEx2();
     obj.run();
     }
}
