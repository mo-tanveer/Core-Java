 class Room 
{
   // Instance Variable
   int length = 10;
  
   //Class Variable
   static int breadth = 20;

}

public class SecondActivity
 {
   public static void main(String args[])

  {
      Room obj = new Room();

    System.out.println("length =" + obj.length);
  
    System.out.println("Through class name = " + obj.breadth);
    System.out.println("Through object name = " + obj.breadth);
}
}
