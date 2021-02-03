//Java program Example real usage of instanceof operator in java.

interface Printable{}

class A implements Printable
{
    public void a()
    {
		System.out.println("a method");
    }
}

class B implements Printable
{
    public void b()
    {
		System.out.println("b method");
    }
}

class Call
{
    void invoke(Printable p)
	{
		//upcasting
	    if(p instanceof A)
		{
    		A obj=(A)p;//Downcasting
    		obj.a();
    	}
    	if(p instanceof B)
    	{
    		B obj1=(B)p;//Downcasting
    		obj1.b();
    	}

    }
}//end of Call class

class instanceofEx4
{
    public static void main(String args[])
    {
    	Printable p=new B();
    	Call c=new Call();
    	c.invoke(p);
    }
}
