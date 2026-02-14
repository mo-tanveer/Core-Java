package com.app;

import java.util.*;

public class Anagram
  {
     public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
      
     System.out.println("Enter the first word");
     String word1 = sc.nextLine().toUpperCase();

     System.out.println("Enter the second word");
     String word2 = sc.nextLine().toUpperCase();


    String sortedString1 = "", sortedString2="";
  
   if(word1.length() == word2.length())
     {
       for(int i=65; i<=95; i++)
        {
          for(int j=0; j<word1.length(); j++)
           {
              char ch1 = word1.charAt(j);
              char ch2 = word2.charAt(j);

              if(i == (int)ch1)
               {
                 sortedString1 = sortedString1 + ch1;
               }
   
              if(i == (int)ch2)
               {
                 sortedString2 = sortedString2 + ch2;
               }
         }
       }

            System.out.println("sorted string1 is :: " + sortedString1);
            System.out.println("sorted string2 is :: " + sortedString2);

           if(sortedString1.equals(sortedString2))
             {
                System.out.println("Words are Anagram");
             }
            else
             {
                System.out.println("Words are not Anagram");
             }
  
          }
       
     else 
          {
               System.out.println("Not Anagram");
          }
 
     }
  
  }