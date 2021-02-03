//Java program example for implementing super keyword for invoking parent class constructor.(Explicitly)
//super is used to invoke parent class constructor.

class Animal
{
    Animal()
    {
		System.out.println("eating...");
    }
}

class Dog extends Animal
{
    Dog()
    {
		super();
		System.out.println("eating bread...");
    }
    void bark()
    {
		System.out.println("barking...");
    }
}

class SuperEx4
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    	d.bark();
    }
}
