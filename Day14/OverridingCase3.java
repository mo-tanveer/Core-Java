
//sirf (ek bar overriding karne ke liye  and extra child class na banane ke liye) 
 //anonymous sub-class method ka use kiya jata hai
// --> isse do do class means class B then extends nhi likhna padta hai



class A
   {
      void sayHello()
       {
         System.out.println("Hello...A");
       }
   }

public class OverridingCase3
   {
     public static void main(String args[])
      {
         A obj = new A() 
                    {   


                       //Overriding through anonymous sub-class

                       void sayHello() 
                         {
                                System.out.println("Hello...Again");
                         }
                    }
           ;

     obj.sayHello();

       }


   }