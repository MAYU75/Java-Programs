//Java program to demonstrate StringBuffer insert() method
//The insert() method inserts the given string
//with this string at the given position.

class StringBufferEx2
{
    public static void main(String args[])
    {
    	StringBuffer sb=new StringBuffer("Hello ");
    	sb.insert(1,"Java");//now original string is changed
    	System.out.println(sb);//prints HJavaello
    }
}
