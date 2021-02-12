//Java program Example for anonymous inner class using class.

abstract class Person
{
      abstract void eat();
}

class AnonymousInnerClassEx1
{
     public static void main(String args[])
     {
     	 Person p=new Person()
     	 {
     	 	void eat()
     	 	{
				System.out.println("nice fruits");
    	 	}
     	 };
      	p.eat();
     }
}
