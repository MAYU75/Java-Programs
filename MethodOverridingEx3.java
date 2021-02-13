//Java Program to illustrate the use of Java Method Overriding

class Vehicle
{
	void run()
    {
		System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}

class Car extends Vehicle
{
	void run()
	{
		System.out.println("car is running");
	}
}

class MethodOverridingEx3
{
	public static void main(String args[])
    {
		//creating an instance of child class
      	Bike obj = new Bike();
      	//calling the method with child class instance
      	obj.run();
      	Car obj1 = new Car();
	    //calling the method with child class instance
        obj1.run();
    }
}
