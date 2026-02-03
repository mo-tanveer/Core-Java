package com.app;

import java.util.*;

public class Second{

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
       finally{
           System.out.println("...Finally block executed..");

         }

      }

}