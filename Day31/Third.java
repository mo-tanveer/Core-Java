package com.app;

class Task implements Runnable
  {
    void run()
     {
       for(int i=1; i<=5; i++)
	{
	  if(i%4 == 0)
 	   {
	      System.out.pritnln(Thread.currentThread().getName() + "" is going to yeald ");
	
	Thread.yeidl();
	   }
     System.out
	}
     }
  }