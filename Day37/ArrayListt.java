package com.app;
import java.util.*;

public class ArrayListt{
public static void main(String args[]){

    ArrayList list = new ArrayList();
 
    list.add("Second");
    list .add("First"); 
    list.add("Third");
    list.add("Fourth");
    list.add("First");
    list.add("Fifth");

    for(int i=0; i<list.size(); i++)
     {
        System.out.println(i + "------>" + list.get(i));
     }

//3-> indexOf() , lastIndexOf()
      
   System.out.println("First Occurence of First elements::" + list.indexOf("First"));
   System.out.println("Last Occurence of First elements::" + list.lastIndexOf("First"));
}
}