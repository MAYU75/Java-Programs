//Java program to demonstrate upcasting.

class Bike
{
	void run()
	{
		System.out.println("running");
	}
}

class SplendorUpcastingEx1 extends Bike
{
	void run()
	{
		System.out.println("running safely with 60km");
	}
    public static void main(String args[])
    {
        Bike b = new SplendorUpcastingEx1();//upcasting
        b.run();
    }
}
