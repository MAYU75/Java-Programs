//Java program to call default constructor from parameterized constructor using this keyword.
class A
{
	//int x;
    A()
    {
		System.out.println("Hello default constructor ");
	}
    A(int x)
    {
    	this();
    	System.out.println("Hello parameterized constructor x= " + x);  //10
    	//System.out.println("x= " + this.x); This statement prints the value of x= 0 i.e default
    	//value of instance variable.
    }
}

class example3this
{
	public static void main(String[] args)
    {
    	A a=new A(10);
    }
}