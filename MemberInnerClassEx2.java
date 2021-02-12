//Java program example for Member inner class.
class student
{
	private int rno=22;
	class address
	{
		public void showdata()
		{
			System.out.println("Roll number " + rno);
		}
	}
}

class MemberInnerClassEx2
{
	public static void main(String[] arg)
	{
		student s=new student();
		student.address sa=s.new address();
		sa.showdata();
	}
}
