package com.app;
import java.util.*;

class MyTask implements Runnable
  {
    public void run()
      {
        for(int i=1; i<=10; i++)
          {
           System.out.println("i=" + i + " Current Thread Name:: " + Thread.currentThread().getName());
          }
      }
  }

public class Second
 {
    public static void main(String args[]) throws Exception
      {
         MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.setName("India");
    	Thread t2 = new Thread(task);
	t2.setName("Japan");
	
	t1.start();
	t1.join();
	t2.start();

        
      }
 }