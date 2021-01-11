//3) Java program example of final variable
class sample
{
	public final int a=15;
}
class fin3main
{

	public static void main(String[] args)
	{
		sample s=new sample();
		System.out.println("a = " + s.a);
		//System.out.println("a = " + s.a=14); error will come since a is declared as final

	}
}