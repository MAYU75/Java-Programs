//Java program Example for local inner class.

public class localInnerClassEx1
{
     private int data=30;//instance variable
     void display()
     {
     	 class Local
     	 {
       		void msg()
       		{
				System.out.println(data);
       		}
     	 }
     	Local l=new Local();
     	l.msg();
     }
     public static void main(String args[])
     {
     	 localInnerClassEx1 obj=new localInnerClassEx1();
     	 obj.display();
     }
}
