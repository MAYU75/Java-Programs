//Java Runtime Polymorphism

class Animal
{
    void eat()
    {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal
{
    void eat()
    {
		System.out.println("dog is eating...");
	}
}

class BabyDogPolymorphismEx6 extends Dog
{
    public static void main(String args[])
    {
    	Animal a=new BabyDogPolymorphismEx6();
    	a.eat();
    }
}
