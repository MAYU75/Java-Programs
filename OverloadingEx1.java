//Java program example for Method Overloading: changing no. of arguments.

class Adder
{
    static int add(int a,int b)
    {
		return a+b;
	}
    static int add(int a,int b,int c)
    {
		return a+b+c;
	}
}

class OverloadingEx1
{
	public static void main(String[] args)
	{
    	System.out.println("Addition of two numbers 11 and 11 is " + Adder.add(11,11));
    	System.out.println("Addition of three numbers 11, 11 and 11 is " + Adder.add(11,11,11));
    }
}
