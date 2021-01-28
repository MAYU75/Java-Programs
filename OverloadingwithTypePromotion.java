//Java program example of Method Overloading with Type Promotion.

class OverloadingwithTypePromotion
{
      void sum(int a,long b)
      {
		  System.out.println("Addition is " + (a+b));
      }
      void sum(int a,int b,int c)
      {
		  System.out.println("Addition is " + (a+b+c));
      }
      public static void main(String args[])
      {
      	OverloadingwithTypePromotion obj=new OverloadingwithTypePromotion();
      	obj.sum(20,20);//now second int literal will be promoted to long
      	obj.sum(20,20,20);
      }
}
