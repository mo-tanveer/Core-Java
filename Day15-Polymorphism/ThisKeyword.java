
class Room
  {
     int length ;
     int breadth ;

    Room(int length, int breadth)
       {
          this.length = length;
          this.breadth = breadth;
       }


     void printValues()
      {
        System.out.println("length=" + length +" breadth =" + breadth);
      }
  }


public class ThisKeyword
    {
      public static void main(String args[])

    {
  
      Room obj = new Room(10,20);
       obj.printValues();

   }
}