//Java program Example for anonymous inner class using interface.

interface Eatable
{
     void eat();
}

class AnnonymousInnerClassEx2
{
     public static void main(String args[])
     {
     	Eatable e=new Eatable()
     	{
      		public void eat()
      		{
				System.out.println("nice fruits");
      		}
     	};
     	e.eat();
     }
}
