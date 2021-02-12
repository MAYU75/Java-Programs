//Java program Example of nested interface which is declared within the class.

class student
{
	interface instudent
	{
		void msg();
	}
	interface instudent1
	{
		void msg1();
	}
}

class NestedInterfaceEx3 implements student.instudent,student.instudent1
{
	public void msg()
	{
		System.out.println("hello from msg");
	}
	public void msg1()
	{
		System.out.println("hello from msg1");
	}
	public static void main(String[] arg)
	{
		student.instudent ss=new NestedInterfaceEx3();
		ss.msg();
		student.instudent1 ss1=new NestedInterfaceEx3();
		ss1.msg1();
	}
}
