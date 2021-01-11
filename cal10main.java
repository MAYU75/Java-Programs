//10) Java program example of method overloading with different no. of parameters
class calculate
{
	public int addition(int n1,int n2)
	{
		return n1+n2;
	}
	//overloading the addition method with 3 integer parameters
	public int addition(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
}

class cal10main
{
	public static void main(String[] arg)
	{
		calculate c=new calculate();
		int r=c.addition(2,3);
		System.out.println("Addition of two integers 2 and 3 is " + r);
		int r1=c.addition(2,3,4);
		System.out.println("Addition of three integers 2,3 and 4 is " + r1);
		System.out.println();
	}
}