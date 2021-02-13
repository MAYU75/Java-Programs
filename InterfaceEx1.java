//Java Interface Example
//In this example, the Printable interface has only one method,
//and its implementation is provided in the InterfaceEx1 class.

interface printable
{
    void print();
}

class InterfaceEx1 implements printable
{
    public void print()
    {
		System.out.println("Hello");
	}
    public static void main(String args[])
    {
    	InterfaceEx1 obj = new InterfaceEx1();
    	obj.print();
    }
}
