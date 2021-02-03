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
	    System.out.println(color);//prints color of Dog (child) class
	    System.out.println(super.color);//prints color of Animal (parent) class
    }
}
class SuperEx1
{
    public static void main(String args[])
    {
    	Dog d=new Dog();
    	d.printColor();
    }
}
