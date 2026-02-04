package com.app;

import java.util.*;


 class Pali
  {   
      
     boolean isPalindrome(int num)
      {
        int temp = num;
        int reverse = 0;

      while(temp > 0)
       {
          int rem = temp%10;
           reverse = reverse*10+rem;
          temp = temp/10;

       }  

       if(reverse == num )
        {
           return true;
        }
        else {
            return false;
         }
      }

    //Prime number
    
         boolean isPrime(int num)
         {
            boolean isPri = true;
         for(int i=2; i<num; i++)
           {
             if(num%i == 0)
              {
                 isPri = false;
                  break;
              }
           }
           return isPri;
       }

  }


public class Palindrome
  {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        
        Pali obj = new Pali();
  
        
        int value = sc.nextInt();
     
     // System.out.println("The Number " + value + " is Palindrome : "  + obj.isPalindrome(value));
      System.out.println("The Number " + value + " is Prime : "  + obj.isPrime(value));


    }
}

