package com.app;

import java.util.*;


abstract class Question
  {
     public abstract boolean isNiven(int num);
    public abstract boolean isPrime(int num);
  }

 class Tests extends Question
   {
      public boolean isNiven(int num)
       {
          int sum = 0;

          int temp = num;
          
        
          while(temp>0)
            {
               int rem = temp%10;
               sum = sum + rem;
               temp = temp/10;
            }
  
          if(num%sum == 0)
           {
             return true;
           }
          else
           {
             return false;
           }
   
       }
  
     public boolean isPrime(int num)
        {
          
        boolean isPri = true;
        for(int i=2; i<num; i++)
          {
             if(num % i == 0)
               {
                 isPri = false;
                   break;
              }
          }
           return isPri;
    }

   }



   public class FirstActivity
    {
     public static void main(String args[])
       {
            Question obj = new Tests();

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the num for Niven.");
           int val = scan.nextInt();
           System.out.println(val + "is Niven :" + obj.isNiven(val));

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number for Prime..");
           int value = sc.nextInt();
           System.out.println(value + "is Prime:" + obj.isPrime(value));

         
           
       } 


   }