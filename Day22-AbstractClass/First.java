package com.app;

 abstract class Room1
      {
         public abstract int calculateArea(int length, int breadth);

         public abstract int calculateVolume(int length, int breadth, int height);


     }
class Test extends Room1
    {
       public int calculateArea(int length, int breadth)
          {
           
             return length * breadth;
          }

       public int calculateVolume(int length, int breadth, int height)
          {
             return length*breadth*height;
          }
    }


public class First
    {
      public static void main(String args[])
      {
          Room1 obj = new Test();

        System.out.println("Area=" + obj.calculateArea(10,20));
        System.out.println("Volume=" + obj.calculateVolume(10,20,30));

      }
 
    }