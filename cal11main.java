//11) Java program example of method overloading with different types of parameters
class cal11main
{
	public int addition(int n1,int n2)
	{
		return n1+n2;
	}
	//overloading the addition method with 2 float parameters
	public float addition(float n1,float n2)
	{
		return n1+n2;
	}

	public static void main(String[] arg)
	{
		cal11main c=new cal11main();
		int r=c.addition(2,3);
		System.out.println("Addition of two given integers is " + r);
		float r1=c.addition(2.2f,3.3f);
		System.out.println("Addition of two given float is " + r1);
	}
}