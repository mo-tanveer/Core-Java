package com.app;

class MyTask implements Runnable 
    {
      public void run()
	{
          for(int i=1; i<=10; i++)
	   {
	    System.out.println("i=" + i + "current thread name : " + Thread.currentThread().getName());
	   }
	}
    }	
	

  public class Third
	{
	  public static void main(String args[])
	    {
               MyTask task = new MyTask();
	       Thread t1 = new Thread(task);
		t1.setName("India");
		t1.start();
	    }
	}