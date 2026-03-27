
//Syncronization of Thread
1)synchronized modifier
package com.app;

 class PrintTable
  {
	synchronized void printValue()
	  {
	     for(int i=2; i<=20; i+=2)
		{
		  System.out.println("i=" + i + "Current Thread Name: " + Thread.currentThread().getName());
		}
	  }
	
  }

class MyTask implements Runnable
    {
    	PrintTable table;
	public MyTask(PrintTable _table)
	 {
            table = _table;
	 }	
        public void run()
	 {
	    table.printValue();
	 }
    }



public class First
  {
     public static void main(String args[])
	{	
	   PrintTable table = new PrintTable();

	   MyTask task = new MyTask(table);	
	   
           Thread t1 = new Thread(task);
	    t1.setName("India");
	   Thread t2 = new Thread(task);
	    t2.setName("China");

 	   t1.start();
	   t2.start();
	}	

  }
