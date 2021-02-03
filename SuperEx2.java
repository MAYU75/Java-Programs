//Java program example for implementing super keyword.
//super is used to refer immediate parent class instance variable.

class Animal
{
	String color="white";
}

class Dog extends Animal
{
	String color="black";
	void printColor()
	{
		System.out.println(super.color);//prints color of Animal class
	}
}

class BabyDog extends Dog
{
	String color="brown";
	void printColor1()
	{
		System.out.println(color);//prints color of BabyDog class
		System.out.println(super.color);//prints color of Dog class
		printColor();
	}
}

class SuperEx2
{
	public static void main(String args[])
	{
	    BabyDog d=new BabyDog();
	    d.printColor1();
    }
}
