//1) Java program to create a instance specific method example
class inst1main
{
	public void display()
	{
		System.out.println("hello from display");
	}
	public static void main(String[] args)
	{
		inst1main s = new inst1main();
		s.display();
	}
}