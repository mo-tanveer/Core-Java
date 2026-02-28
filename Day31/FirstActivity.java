package com.app;
import java.util.*;

class MyThread extends Thread
  {
     public void run()
      {
        //Running state (3)
        for(int i=1; i<=10; i++)
         {
             if(i == 5)
               {
                 Scanner sc = new Scanner(System.in);  
                 System.out.println("Enter the Name::");
                 String name = sc.nextLine();  //Blocked State (4)
                 System.out.println("Hello " + name);
               }

            System.out.println("i " + i + " Cuurrent Thread name :: " + Thread.currentThread().getName());
         }
      }
  }  // Dead & terminated state (5)

 public class FirstActivity
  {
    public static void main(String args[])
     {
       MyThread t = new MyThread();  //new born state (1)
       t.start();   //ready to run state (runnable)  (2)
       //t.start();
     }
  }