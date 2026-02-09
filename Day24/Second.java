package com.app;


interface Room
    {
      int calculateArea(int length, int breadth);
      int calculateVolume(int l, int b, int h);
    }



public class Second
   {
    public static void main(String args[])
    {
        Room obj = new Room()
          {
             public int calculateArea(int length, int breadth)
           {
               return length*breadth;

           }
             public int calculateVolume(int l, int b, int h)
           {
               return l*b*h;

           }
    };
      
       System.out.println(obj.calculateArea(10,20));
        System.out.println(obj.calculateVolume(10,20,30));
     }
   }