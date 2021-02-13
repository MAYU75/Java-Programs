//Java program Example of Runtime Polymorphism with Data Member.

class Bike
{
	int speedlimit=90;
}

class HondaPolymorphismEx4 extends Bike
{
    int speedlimit=150;
    public static void main(String args[])
    {
    	Bike obj=new HondaPolymorphismEx4();
      	System.out.println(obj.speedlimit);//90
    }
}
