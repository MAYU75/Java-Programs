//Java program example for implementing super keyword for invoking parent class constructor (explicitly)
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
    	super();
    	System.out.println("dog is created");
    }
}

class SuperEx5
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    }
}
