//Java program Example for Downcasting with java instanceof operator.
//When Subclass type refers to the object of Parent class, it is known as downcasting.
//If we perform it directly, compiler gives Compilation error.
//Dog d=new Animal();//Compilation error
//If you perform it by typecasting, ClassCastException is thrown at runtime.
//Dog d=(Dog)new Animal();
//Compiles successfully but ClassCastException is thrown at runtime
//But if we use instanceof operator, downcasting is possible.

class Animal { }
class DogDowncastingEx1 extends Animal
{
	static void method(Animal a)
    {
      	if(a instanceof DogDowncastingEx1)
      	{
           DogDowncastingEx1 d=(DogDowncastingEx1)a;//downcasting
           System.out.println("ok downcasting performed");
        }
    }
    public static void main (String[] args)
    {
        Animal a=new DogDowncastingEx1();
        DogDowncastingEx1.method(a);
    }
}
