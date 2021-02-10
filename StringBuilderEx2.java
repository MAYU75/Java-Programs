//Java program Example to demonstrate StringBuilder append() method.
//The StringBuilder append() method concatenates the
//given argument with this string.

class StringBuilderEx2
{
    public static void main(String args[])
    {
    	StringBuilder sb=new StringBuilder("Hello ");
    	sb.append("Java");//now original string is changed
    	System.out.println(sb);//prints Hello Java
    }
}
