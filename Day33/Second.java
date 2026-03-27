//synchronized block
package com.app;

class PrintSeries{
   void printValue(){
     for(int i=1; i<=10; i++){
      System.out.println("i=" + i + " Current Thread Name: " + Thread.currentThread().getName());

}
}	
}
   

class MyTask implements Runnable{
  PrintSeries series;
  public MyTask(PrintSeries _series){
     series = _series;
}
 public void run(){
   synchronized(series){
    series.printValue();
}
}
}

public class Second{
public static void main(String args[]){
 PrintSeries series = new PrintSeries();
 MyTask task = new MyTask(series);
 Thread t1 =  new Thread(task);
 Thread t2 = new Thread(task);

 t1.setName("Mohd");
 t2.setName("Tanveer");
 t1.start();
 t2.start();
}
}