package com.another;


public class ThirdActivity
  {
    public static void main(String args[])
     {
        Room3 obj = new Room3();
       System.out.println("Lenght= " + obj.length);
        obj.sayHello();

     Room3.Chamber obj_chamber = new Room3().new Chamber(); 
     }
   }