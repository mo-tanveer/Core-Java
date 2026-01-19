

 class A
  {
    int length = 10;
  }

 class B extends A 
  {
    int length = 20;
  }
 
 public class OverridingCase1
   {
     public static void main(String args[])
       {
         A obj = new B();
         System.out.println("Length =" + obj.length);
        }

   }