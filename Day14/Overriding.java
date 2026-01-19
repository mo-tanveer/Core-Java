/*
    class A  
       {
          void sayHello()
           {
             System.out.println("Hello....A");
           }
      
       }

    class B extends A
       {
          void sayHello()
           {
             System.out.println("Hello....B");
           }
      
       }



     public class Overriding 
      {
        public static void main(String args[])
          {
   
              A obj = new B();
            
              obj.sayHello();

          }
   
      }

*/


// A final method can not be overridden -> it gives  error
    class A  
       {
           Final void sayHello()
           {
             System.out.println("Hello....A");
           }
      
       }

    class B extends A
       {
           Final void sayHello()
           {
             System.out.println("Hello....B");
           }
      
       }



     public class Overriding 
      {
        public static void main(String args[])
          {
   
              A obj = new B();
            
              obj.sayHello();

          }
   
      }








   
/*

  //static methods do not follow the principal of overrifing
    class A  
       {
          static void sayHello()
           {
             System.out.println("Hello....A");
           }
      
       }

    class B extends A
       {
          static void sayHello()
           {
             System.out.println("Hello....B");
           }
      
       }



     public class Overriding 
      {
        public static void main(String args[])
          {
   
              A obj = new B();
            
              obj.sayHello();

          }
  
      }

*/
