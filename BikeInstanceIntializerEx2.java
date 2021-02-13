//Java program Example of instance initializer block
//What is invoked first, instance initializer block or constructor?

class BikeInstanceIntializerEx2
{
	int speed;

    BikeInstanceIntializerEx2()
    {
		System.out.println("constructor is invoked");
	}

    {
		System.out.println("instance initializer block invoked");
	}

    public static void main(String args[])
    {
        BikeInstanceIntializerEx2 b1=new BikeInstanceIntializerEx2();
        BikeInstanceIntializerEx2 b2=new BikeInstanceIntializerEx2();
    }
}
