//Java program Example of nested interface which is declared within the class.

class A
{
      interface Message
      {
       void msg();
      }
}

class NestedInterfaceEx2 implements A.Message
{
     public void msg()
     {
		 System.out.println("Hello nested interface");
     }
     public static void main(String args[])
     {
     	 A.Message message=new NestedInterfaceEx2();//upcasting here
     	 message.msg();
     }
}
