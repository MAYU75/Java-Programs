//Java program Example of static nested class with instance method.

class StaticNestedClassEx1
{
      static int data=30;
      static class Inner
      {
      	 void msg()
      	 {
			 System.out.println("data is "+data);
      	 }
      }
      public static void main(String args[])
      {
      	StaticNestedClassEx1.Inner obj=new StaticNestedClassEx1.Inner();
      	obj.msg();
      }
}
