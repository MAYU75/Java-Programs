//6) Java program to create a class student having fields rno and name and getdata method
//with 2 parameters and showdata method
import java.util.*;
class student
{
//properties or attributes
private int rno;
private String name;
//methods
void getdata(int r,String n)
{
rno=r;
name=n;
}
void showdata()
{
System.out.println("Roll no of student " + rno);
System.out.println("Name of student " + name);
}
}
class stud6main
{
public static void main(String[] arg)
{
//creating an object of student class
student s1=new student();
int rollnumber;
String studentname;
Scanner scan=new Scanner(System.in);
System.out.println("enter student roll no");
rollnumber=scan.nextInt();
System.out.println("enter student name");
studentname=scan.next();
s1.getdata(rollnumber,studentname);
s1.showdata();
}
}
