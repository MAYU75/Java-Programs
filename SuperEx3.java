//Java program example for implementing super keyword with method.
//super can be used to invoke parent class method

class Animal
{
    void eat()
    {
		System.out.println("eating...");
    }
}

class Dog extends Animal
{
    void eat()
    {
		System.out.println("eating bread...");
    }
    void bark()
    {
		System.out.println("barking...");
    }
    void work()
	{
    	super.eat();
    	bark();
    }
}

class SuperEx3
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    	d.work();
    }
}
