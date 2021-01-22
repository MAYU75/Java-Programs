//Java program to demonstrate singlelevel inheritance.

class Employee
{
     float salary=40000;
}

class Programmer extends Employee
{
     int bonus=10000;
     public static void main(String args[])
     {
		 Programmer p=new Programmer();
       	 System.out.println("Programmer's salary is:" + p.salary);
       	 System.out.println("Bonus of Programmer is:" + p.bonus);
     }
}
