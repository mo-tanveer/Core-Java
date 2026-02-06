package com.app;


abstract class Room2 
  {
      public abstract int calculateArea(int length, int breadth);

     public void sayHello()
       { 
          System.out.println("Hello..Room");
       }

  }


public class Second
  {
      public static void main(String args[])
       {
         Room2 obj = new Room2()
   
                     { 
                        public int calculateArea(int length, int breadth)
                          {
                             return length*breadth;
                          }

                     };

    System.out.println("Area=" + obj.calculateArea(20,30));
    obj.sayHello();
       }
  }