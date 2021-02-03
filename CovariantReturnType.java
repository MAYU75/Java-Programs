//Java program example for Covariant Return Type.
//(used to override method using return type)

class A
{
    A get()
    {
		return this;
    }
}
class CovariantReturnType extends A
{
    CovariantReturnType get()
    {
		return this;
    }
    void message()
    {
		System.out.println("welcome to covariant return type");
    }
    public static void main(String args[])
    {
    	new CovariantReturnType().get().message();
    }
}
