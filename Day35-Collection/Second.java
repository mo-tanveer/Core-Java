package com.app;

import java.util.*;

public class Second
 {
  public static void main(String args[])
   {
     Collection c = new HashSet();

     c.add("First");
     c.add("Second");
     c.add("Third");
     c.add("Fourth");
   System.out.println("Elements in the collections::" + c);

     c.clear();
  //System.out.println("Elements in the collections::" + c);

    
  System.out.println("The Third available in collections::" + c.contains("Third"));

  System.out.println("Is current collection empty::" + c.isEmpty());
   }
 }