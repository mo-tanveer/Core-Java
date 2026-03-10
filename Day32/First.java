//Priority of Thread

package com.app;
 
  class Task implements Runnable{
       public void run(){
	  for(int i=1; i<=100; i++){
             System.out.println("i=" + i + "Current Thread:: " + Thread.currentThread());
	}
	}
	}


 public class First{
	public static void main(String args[]){
	  Task task = new Task();

	  Thread t1 = new Thread(task);
	  Thread t2 = new Thread(task);

          t1.setPriority(Thread.MIN_PRIORITY);
	  t2.setPriority(Thread.MAX_PRIORITY);

          t1.setName("India");
	  t2.setName("Japan");
	  t1.start();
	  t2.start();
	}
	}