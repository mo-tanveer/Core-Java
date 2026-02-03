package com.app;

import java.util.*;

public class First{

    public static void main(String args[])
      {
        int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the denominator");

        int den = sc.nextInt();

   try{
        int result = num/den;
       System.out.println("Result of division:: " + result);
      }
   catch(ArithmeticException e)
      {
         System.out.println("Catch block executed..");
         System.out.println("Division by zero is Impossible..");
      }
    finally{
           System.out.println("...Finally block executed..");

         }

      }

}