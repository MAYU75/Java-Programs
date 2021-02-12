//Java program example for Member inner class.
//In this example, we are creating msg() method in member inner class
//that is accessing the private data member of outer class.

class MemberInnerClassEx1
{
     private int data=30;
     class Inner
     {
     	void msg()
     	{
			System.out.println("Data is "+data);
     	}
     }
     public static void main(String args[])
     {
     	 MemberInnerClassEx1 obj=new MemberInnerClassEx1();
     	 MemberInnerClassEx1.Inner in=obj.new Inner();
     	 in.msg();
     }
}
