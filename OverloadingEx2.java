//Java program example for Method Overloading: changing data type of arguments.

class Adder
{
    static int add(int a, int b)
    {
		return a+b;
    }
    static double add(double a, double b)
    {
		return a+b;
    }
}

class OverloadingEx2
{
    public static void main(String[] args)
    {
    	System.out.println("Addition of two numbers 11 and 11 is " + Adder.add(11,11));
    	System.out.println("Addition of two numbers 12.3 and 12.6 is " + Adder.add(12.3,12.6));
    }
}
