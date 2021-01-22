//Java program to call default constructor from parameterized constructor using this keyword.
class A
{
	int x;
    A()
    {
		x=20;
		System.out.println("Hello default constructor x = " + x); //20
	}
    A(int x)
    {
    	this();
    	System.out.println("Hello parameterized constructor x= " + this.x); //20
    }
}

class example2this
{
	public static void main(String[] args)
    {
    	A a=new A(10);
    }
}