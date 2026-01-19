

class A 
    {
        A( String name)
   
          { 
             super();
             System.out.println("Constructor of .... A");
             System.out.println("Hello " + name);
          }

    }

class B extends A
     {
  
         B()
         
          {   super("Tanveer");
             System.out.println("Constructor of .....B");
          }


     }


public class SuperConst 
    {
      public static void main(String args[])
       {
          A obj = new B();
        }




    }