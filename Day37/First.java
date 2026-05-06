package com.app;
import java.util.*;

public class First{
public static void main(String args[]) throws Exception{
  
    Collection c = new HashSet();

	c.add("First");
	c.add("Second");
	c.add("Third");
	c.add("Fourth");
	c.add("Fifth");
 
 System.out.println("Elements in collection :: " + c);

 /*
	Iterator itr = c.iterator(); //method
	
	while(itr.hasNext())
	 {
	   System.out.println(itr.next());
	   Thread.sleep(1000);
	 }
*/

//6--> remove method():
   
        c.remove("Second");
      System.out.println("Elements in Collection :: " + c);
   
     System.out.println("Number of Elemets in Collection:: " + c.size());
 
}
}