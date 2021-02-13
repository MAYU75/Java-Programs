//Java program Example of instance initializer block
//example of instance initializer block that performs initialization.

class BikeInstanceIntializerEx1
{
	int speed;
    BikeInstanceIntializerEx1()
    {
		System.out.println("speed is "+speed);
	}
    {
		speed=100;
	}

    public static void main(String args[])
    {
        BikeInstanceIntializerEx1 b1=new BikeInstanceIntializerEx1();
        BikeInstanceIntializerEx1 b2=new BikeInstanceIntializerEx1();
    }
}
