package com.app;

import java.util.*;

public class Third{
  public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Age:: ");

     int age = sc.nextInt();


     assert(age > 17) : "Age is Invalid";

System.out.println("Age is :: " + age);

   }
  

}