//Main method for object creation and execution file

package com.app;

public class WaiterNotifier{
 public static void main(String args[]){
 Message obj = new Message();
 Waiter waiter = new Waiter(obj);
 Notifier notifier = new Notifier(obj);

Thread waiterTask = new Thread(waiter);
 Thread notifierTask = new Thread(notifier);

waiterTask.start();
notifierTask.start();
}
}