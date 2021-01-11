//2) Java program to create a static method display() and show1().
class sample
{
	int j=1;
	static int i=1;
	public static void show1()
	{
		i=i+1;
		System.out.println("hello from show1 i= " + i);
	}
	public void show()
	{
		j=j+1;
		System.out.println("hello from show j= " + j);
	}
}
class stat2main
{
	public static void display()
	{

		System.out.println("hello from display ");
	}
	public static void main(String[] args)
	{

		display();
		sample s=new sample();
		s.show();
		s.show1();
		sample s1=new sample();
		s1.show();
		s1.show1();
		s.show();
		sample.show1();

	}
}