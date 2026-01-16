/*class Room
  {
     Room()  // constructor
      {
         System.out.println("Room.....");
      }

      static
          {
             System.out.println("Static Initializationm Block Executed.....");
           }

   }



public class FirstActivity 
     {
      public static void main(String args[])
       {

         Room obj = new Room();
       }

     }

*/







class Room
  {
     Room()  // constructor
      {
         System.out.println("Room....."); // Excuted after Static and instance ,everytime whenever object created
      }

      static       //executed First but once in a whole life 
          {
             System.out.println("Static Initializationm Block Executed.....");    
           }

       {
             System.out.println("Instance Initialization Block Executed.......");     //Executed After static before constructor ,every time excuted whenever object is created
       
       }
   }



public class FirstActivity 
     {
      public static void main(String args[])
       {

         Room obj = new Room();
         Room obj1 = new Room();
         Room obj2 = new Room();
         Room obj3 = new Room();

       }

     }
































