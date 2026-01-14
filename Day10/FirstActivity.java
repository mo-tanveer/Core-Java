/* class Room
 {
    
   int length;
   int breadth;


Room(int l, int b )
 
{
   length = l;
   breadth = b;

}


int calculateArea()
{
    return length * breadth;
}
}

public class FirstActivity

 {

   public static void main(String args[])

 {
     Room obj = new Room(10,20);

    System.out.println("length = " + obj.length);
    System.out.println("breadth = " + obj.breadth);


    System.out.println("Area=" + obj.calculateArea());
}
}
*/






















/*

class House 
{
   //instance variable
   int length;
   int breadth;

House(int l, int b)  //constructor
{
   length = l;
   breadth = b;

}

int calculateArea()
{

  return length * breadth;
}
}


public class FirstActivity
{

   public static void main(String args[])
{
   House object = new House(30,50);

  System.out.println("length of the House = " + object.length);
  System.out.println("Breadth of the House = " + object.breadth);

  System.out.println("Area of the House = " + object.calculateArea());
}
}
*/
























class Room 
 {
   int length;
   int breadth;


 Room(int l, int b)
  {
   length = l;
   breadth = b;
}
  int calculateArea()
   {
    return length*breadth;
   }
    
  }
 
public class FirstActivity
{
   public static void main(String args[])
   {
     Room object = new Room (10,20);
     System.out.println("Length :" + object.length);
     System.out.println("Breadth :" + object.breadth);


    System.out.println("Calculated Area :" + object.calculateArea());
   }

}

