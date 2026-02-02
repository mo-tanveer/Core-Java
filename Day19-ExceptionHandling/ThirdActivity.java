package com.app;

import java.util.*;


public class ThirdActivity
    {
      public static void main(String args[])
        {
          int numerator = 10;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Denominator :: ");

         int denominator = sc.nextInt();

     try{
         int result = numerator/denominator; // new Arithmetic Exception------------->JVM
        System.out.println("The Result of Division is ::" + result);
      
        }
     catch(ArithmeticException e)
        {
           System.out.println("Divisible by zero is Impossible");
        }

     int result_add = numerator + denominator;

   System.out.println("Result of Addition :: " + result_add);


}

 }