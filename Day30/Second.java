package com.app;

class Test extends Thread
  {
     public void run()
       {
	  for(int i=0; i<10; i++)
	    {
	        System.out.println("i=" + i +" current Thread Name " + Thread.currentThread().getName());
	    }
	}
  }

 public class Second
   {
     public static void main(String args[])
	{
	   Test obj = new Test();
	   obj.setName("threadn"); // to set thread name
	   obj.start(); //provokes execution as separate thread
          //obj.run(); // same thread : main
	}
	
   }