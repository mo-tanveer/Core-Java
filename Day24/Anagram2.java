package com.app;

import java.util.*;

 class Anag
 {
    void bubbleSort(char[] arr)
     {
       for(int i= 0; i<arr.length-1; i++)
          {
            for(int j=0; j<arr.length-1-i; j++)
              {
                 if(arr[j] > arr[j + 1])
                   {
                     char temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                   }
              }


          }
     }

   boolean checkAnagram(String str1, String str2)
     {
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       if(str1.length() != str2.length())
         
            return false;
         
             char [] a = str1.toCharArray();
             char [] b = str2.toCharArray();


             bubbleSort(a);
             bubbleSort(b);

           for(int i=0; i<a.length; i++)
            {
                 if(a[i] != b[i])
                   {
                     return false;
                   }
                  }
                  
                 return true;
                   
             }   
 }

public class Anagram2
  {
    public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String 1...");
          String s1 = sc.nextLine();

         System.out.println("Enter the String 2...");
         String s2 = sc.nextLine();
   
         Anag obj = new Anag();

         if(obj.checkAnagram(s1,s2))
            {
              System.out.println("Strings are Anagram");
            }
         else
            {
             System.out.println("Strings are not Anagram");
            }
     }
  }