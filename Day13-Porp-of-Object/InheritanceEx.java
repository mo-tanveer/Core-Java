 class A  
   {
      int length = 10;
       
      void sayHello()
       {
         System.out.println("Hello......A");
       }
 }

class B extends A
    {
      int breadth = 20;
      
      void sayHi()
       {
         System.out.println("Hi..... B");
       }

    }


public class InheritanceEx
   {
  
     public static void main(String args[])
      {
         B obj = new B();

        // A parent class object can be instantiated through its child class object.
        // A obj = new B();
       
       System.out.println("Length=" + obj.length);

       //you can  not access the child class member using this object normally
       System.out.println("Breadth=" + obj.breadth);

          obj.sayHello();

         //you can  not access the child class member using this object normally
          obj.sayHi();

      }
   }