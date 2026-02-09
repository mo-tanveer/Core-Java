package com.app;
import java.util.*;

class A 
  {
    boolean checkAnagram(String str1, String str2)
   {

      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      if(str1.length() != str2.length())
         {
            return false;
         }
       else
         {
            char [] a = str1.toCharArray();
           
            char [] b = str2.toCharArray();


            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a,b);

         }
   }

  }

public class Anagram
  {
    public static void main(String args[])
      {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter String 1..");
         String s1 = sc.nextLine();

            
         System.out.println("Enter String 2..");
         String s2 = sc.nextLine();

        A obj = new A();
        
        boolean result = obj.checkAnagram(s1,s2);
  
          if(result)
           {
             System.out.println("The Strings are Anagram");

           }
           else
            {
              System.out.println("The String are not Anagram");
            }

      }

  }