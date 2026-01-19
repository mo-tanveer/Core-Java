class A 
   { 
      void sayHello()
      {
      System.out.println("Hello...A");
   }
}


 public class OverridingCase4 
   {
     public static void main(String args[])
      {
   
         A obj = new A() 
                    {
                       void sayHello()
                        {
                          System.out.println("Hello. Again");
                        }
                    }
                ;
             obj.sayHello();

  
          (new A() 
                 {
                    void sayHello()
                     {
                       System.out.println("Hello doing.....Again!");
                     }
                 }).sayHello();
      }

    }