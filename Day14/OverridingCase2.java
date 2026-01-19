//Super keyword refers to the object of super class //within subclass

class A 
{  
   void sayHello()
   {
     System.out.println("Hello.....A");
   }
} 


class B extends A 
 {
   void sayHello()
 {
   super.sayHello();  //Refers to object of super class within sayHello();
   System.out.println("Hello.....B");
 }

}


public class OverridingCase2
  {
    public static void main(String args[])
   {
     A obj = new B();
     obj.sayHello();
  }
}