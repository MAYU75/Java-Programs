//Java program Example of super keyword where super() is provided by the compiler implicitly.
//super is used to invoke parent class constructor.

class Animal
{
    Animal()
    {
		System.out.println("animal is created");
    }
}

class Dog extends Animal
{
    Dog()
    {
		//super(); Implicitly invoked.
    	System.out.println("dog is created");
    }
}

class SuperEx6
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    }
}
