package com.app;

import java.util.*;


public class FourthActivity
    {
      public static void main(String args[])
        {
          int numerator = 10;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Denominator :: ");

  

     try{
         int denominator = sc.nextInt();
         int result = numerator/denominator; // new Arithmetic Exception------------->JVM
        System.out.println("The Result of Division is ::" + result);
      
        }
     catch(ArithmeticException e)
        {
           System.out.println("Divisible by zero is Impossible");
        }
     catch(InputMismatchException e)
        {
           System.out.println("Invalid input occured..");
        }
     catch(Exception e)
        {
           System.out.println("fatal exception is coming .... developer concern is required");
        }

}

 }