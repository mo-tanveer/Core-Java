
// Protected members can be accessed outside the current package using the inheritance class object
// Portected Inner class object can be created outside the package 
// if and only if constructor is declared as public

package com.app;

public class Room5  // outer class
  {
     protected int length = 10;

     protected void sayHello()
       {
         System.out.println("Hello from protected");
       }

  protected class Chamber   //Inner class
     {
          public Chamber()
         {
            System.out.println("Object created..chamber() executed");
         }
    }
  }