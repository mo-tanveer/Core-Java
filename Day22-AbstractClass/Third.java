package com.app;

abstract class Aclass
    {
       public Aclass()
     {
      System.out.println("Constructor.....Aclass");

   }
}

class Test1 extends Aclass
     {

         public Test1()
           {
              System.out.println("Constructor of Test1");
 
           }

      }

public class Third
 {
   public static void main(String args[])
    {
       Aclass obj = new Test1();
   }
 
 }