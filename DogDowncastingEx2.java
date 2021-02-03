//Java program Example for Downcasting without the use of java instanceof operator.

class Animal { }

class DogDowncastingEx2 extends Animal
{
      static void method(Animal a)
      {
           DogDowncastingEx2 d=(DogDowncastingEx2)a;//downcasting
           System.out.println("ok downcasting performed");
      }
      public static void main (String [] args)
      {
      	  Animal a=new DogDowncastingEx2();
      	  DogDowncastingEx2.method(a);
      }
}
