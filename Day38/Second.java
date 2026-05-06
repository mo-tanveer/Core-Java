//remove()
//set()
package com.app;
import java.util.*;

public class Second{
public static void main(String args[]){
 
	List list = new ArrayList();
	
	list.add("First");
	list.add("Second");
	list.add("Third");
	list.add("Fourth");
	list.add("Fifth");

System.out.println("Elements::" + list);
list.remove("Third");

System.out.println("Ater remove " + list);

list.set(1,"Two");
System.out.println("After Set" + list);
}
}