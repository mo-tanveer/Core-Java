package com.app;

interface Iface
    {
      public abstract void sayHi();
    void sayHello();

    
     static void imStatic()
      {
        System.out.println("I am static ");

      }
   
     default void imDefault()
      {
        System.out.println("I am default");
      }

   }

class Test implements Iface
  {
    public void sayHello()
     {
       System.out.println("Hello.. Interface");
     }

     public void sayHi()
      {
        System.out.println("Hi Interface");
   
     }

  }

public class Interface
  {
    public static void main(String args[])
     {
        Iface obj = new Test();
  
        obj.sayHi();
        obj.sayHello();
        obj.imDefault();
       Iface.imStatic();
 
     } 
  }