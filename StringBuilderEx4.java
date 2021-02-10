//Java program Example to demonstrate StringBuilder replace() method
//The StringBuilder replace() method replaces
//the given string from the specified beginIndex and endIndex.

class StringBuilderEx4
{
    public static void main(String args[])
    {
    	StringBuilder sb=new StringBuilder("Hello");
    	sb.replace(1,3,"Java");
    	System.out.println(sb);//prints HJavalo
    }
}
