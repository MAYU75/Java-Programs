//Java program Example of final variable.

class finalEx1
{
     final int speedlimit=90;//final variable
     void run()
     {
      speedlimit=400;
     }
     public static void main(String args[])
     {
     	finalEx1 obj=new  finalEx1();
     	obj.run(); //Compile time error
     }
}//end of class
