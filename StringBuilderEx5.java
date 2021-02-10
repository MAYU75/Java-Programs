//Java program Example to demonstrate StringBuilder delete() method.
//The delete() method of StringBuilder class deletes
//the string from the specified beginIndex to endIndex.

class StringBuilderEx5
{
    public static void main(String args[])
    {
    	StringBuilder sb=new StringBuilder("Hello");
    	sb.delete(1,3);
    	System.out.println(sb);//prints Hlo
    }
}
