class Room
{ 

  int length;

 Room(int l) //parameterized constructor
   
  {
   length = l;
   }
 }
  

public class FourthActivity
  {
   public static void main(String args[])
{
   Room obj = new Room(20);
   System.out.println("length=" + obj.length);

}
}
