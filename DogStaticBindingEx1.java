//Java program Example of static binding.
//When type of the object is determined at compiled time(by the compiler),
//it is known as static binding.
//If there is any private, final or static method in a class, there is static binding.

class DogStaticBindingEx1
{
    private void eat()
    {
		 System.out.println("dog is eating...");
	}
    public static void main(String args[])
    {
    	DogStaticBindingEx1 d1=new DogStaticBindingEx1();
     	d1.eat();
    }
}
