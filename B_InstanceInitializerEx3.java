//Java Program of instance initializer block that is invoked after super()

class A
{
    A()
    {
    	System.out.println("parent class constructor invoked");
    }
}

class B_InstanceInitializerEx3 extends A
{
    B_InstanceInitializerEx3()
    {
    	super();
    	System.out.println("child class constructor invoked");
    }

    {
		System.out.println("instance initializer block is invoked");
	}

    public static void main(String args[])
    {
    	B_InstanceInitializerEx3 b=new B_InstanceInitializerEx3();
    }
}
