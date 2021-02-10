//Java program Example to demonstrate StringBuilder capacity() method.
//The capacity() method of StringBuilder class returns
//the current capacity of the Builder.
//The default capacity of the Builder is 16.
//If the number of character increases from its current capacity,
//it increases the capacity by (oldcapacity*2)+2.
//For example if your current capacity is 16, it will be (16*2)+2=34.

class StringBuilderEx7
{
    public static void main(String args[])
    {
    	StringBuilder sb=new StringBuilder();
    	System.out.println(sb.capacity());//default 16
    	sb.append("Hello");
    	System.out.println(sb.capacity());//now 16
    	sb.append("java is my favourite language");
    	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
    }
}
