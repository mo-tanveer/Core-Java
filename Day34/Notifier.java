//notify()

package com.app;
import java.util.*;

public class Notifier implements Runnable{
  Message message;
  public Notifier(Message _message)
   {
    message = _message;
   }

public void run(){
  try
    {
      synchronized(message)
       {
          System.out.println("Notifier thread entry time:: "+ new Date());
System.out.println("Notification will be called after 5 second ::" + new Date());

	Thread.sleep(5000);
System.out.println("Notificiation fired......" + new Date());
	message.notify();
       } 	
    }
  catch(Exception e)
    {
      System.out.println("Reason for error:: " + e.getMessage());
    }
}
}