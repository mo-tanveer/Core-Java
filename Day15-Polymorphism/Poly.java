
class Room {
 
             int length;
             int breadth;
     
 
         Room(int l)
           { 
              length = l;
              breadth = l;
           }
   
        Room(int l, int b)
          {
           length = l;
           breadth = b;
         }

   int calculateArea()
         {
            return length * breadth;
         }
}


public class Poly 
  {
    public static void main(String args[])
    {
        Room obj = new Room(10,20);
         System.out.println("Area = " + obj.calculateArea());

    }
   }