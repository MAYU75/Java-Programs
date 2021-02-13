//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class.(Example: Bank class)
class Bank
{
	static int roi=2;
    int getRateOfInterest()
    {
		return 0;
    }
    static void showroi()
    {
		System.out.println("roi from static method : " + roi);
	}
}

//Creating child classes.
class SBI extends Bank
{
	int getRateOfInterest()
	{
		roi=roi+2;
		return roi;
	}
}

class ICICI extends Bank
{
    int getRateOfInterest()
    {
		return 7;
    }
}

class AXIS extends Bank
{
    int getRateOfInterest()
    {
		return 9;
    }
}

//Test class to create objects and call the methods
class MethodOverridingEx5
{
    public static void main(String args[])
    {
    	SBI s=new SBI();
    	Bank.showroi();
    	ICICI i=new ICICI();
    	AXIS a=new AXIS();
    	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
   		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
   		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
