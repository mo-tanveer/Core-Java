//Wait()

package com.app;
import java.util.*;
public class Waiter implements Runnable{
  Message message;
public Waiter(Message _message){
  message = _message;
}

public void run(){
  try{
       synchronized(message){
	  System.out.println("Waiter thread entry time :: " + new Date());
          System.out.println("I will call the wait() after 5 second ::" + new Date());

	Thread.sleep(5000);
System.out.println("Wait.....fired" + new Date());
   message.wait();
System.out.println("Wait is over at :: " + new Date());
	}
     }
  catch(Exception e){
    System.out.println("Reason for Error::" + e.getMessage());
    }
}
}