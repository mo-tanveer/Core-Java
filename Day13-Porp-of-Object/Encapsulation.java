class Room2 
 
    {
       private int length = 10;

    

     int getLength()
      {
         return length;
      }
}
 
   public class Encapsulation
     {
       public static void main(String args[])
        {
          Room2 obj = new Room2();
         
          System.out.println("Length: " + obj.getLength());
 
        }


     }