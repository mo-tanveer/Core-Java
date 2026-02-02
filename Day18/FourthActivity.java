package com.app;


class Room4
    {
      class Chamber {
             Chamber()
                {
                  System.out.println("Object of inner class can be created");
                 }
       void sayHelloChamber()
        {
          System.out.println("Hello...chamber");
        }
    }
}

public class FourthActivity
   {
     public static void main(String args[])
       {
         Room4.Chamber obj_chamb = new Room4().new Chamber();

   obj_chamb.sayHelloChamber();
       }
   }
