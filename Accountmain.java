//Java program to create a base class account having fields actno and balance
//and methods deposit and withdrawl and showbalance.
//create a child class saving inherited from account class and override the deposit method.
//create a child class current inherited from account class . (Example of hierarchical Inheritance.)

import java.util.*;
class Account
{
	int actno;
	float balance=1000;
	String str="";
	void deposit(float amt)
	{
		balance=balance + amt;
	}
	void withdrawl(float amt)
	{
		balance=balance - amt;
	}
	String showbalance()
	{
		str = "act no " + actno + " balance is " + balance;
		return str;
	}
}
/////////////////////////
class Saving extends Account
{
	int interest = 200;
	//overriding the account class deposit  method
	void deposit(float amt)
	{
		balance=balance + amt + interest;
	}
}
///////
class Current extends Account
{
}
///////////////////////////////////////
class Accountmain
{
    public static void main(String args[])
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("enter account no");
       int ano=s1.nextInt();
       System.out.println("enter amount");
       float amt=s1.nextFloat();
       System.out.println("enter account type (saving or current)");
       String acttype=s1.next();
       System.out.println("enter deposit or withdrawl");
       String tran=s1.next();
       String result="";
       if(acttype.equals("saving"))
       {
		   Saving s=new Saving();
		   s.actno=ano;
		   if(tran.equals("deposit"))
		   {
		   		s.deposit(amt);
	   	   }
	   	   else if(tran.equals("withdrawl"))
		   {
		   		s.withdrawl(amt);
	   	   }
	   	  result= s.showbalance();
	   }
	   else if(acttype.equals("current"))
	   {
		   Current s=new Current();
		   s.actno=ano;
		   if(tran.equals("deposit"))
		   {
		   		s.deposit(amt);
		   }
		   else if(tran.equals("withdrawl"))
		   {
		   		s.withdrawl(amt);
		   }
	   	   result= s.showbalance();
	   }
	   else
	   {
		   System.out.println("invalid inputs");
	   }
		System.out.println(result);
	}
}
