//Java program Example to demonstrate StringBuilder insert() method.
//The StringBuilder insert() method inserts
//the given string with this string at the given position.

class StringBuilderEx3
{
    public static void main(String args[])
    {
    	StringBuilder sb=new StringBuilder("Hello ");
    	sb.insert(1,"Java");//now original string is changed
    	System.out.println(sb);//prints HJavaello
    }
}
