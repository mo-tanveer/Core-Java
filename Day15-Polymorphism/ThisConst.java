class Room 
  {
     int length ;
     int breadth ;
  

   Room()
      {
        this(10,11);
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

 public class ThisConst
    {
     public static void main(String args[])
       {
         Room obj = new Room();
        System.out.println("Area = " + obj.calculateArea());
  
        }
    }
