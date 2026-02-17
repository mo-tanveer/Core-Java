package com.app;













/*
import java.util.*;

class A 
  {
      void generatePermutation(String str)
      {
        int n = str.length();

        for(int i=0; i<n; i++)
         {
           for(int j=0; i<n; j++)
             {
              for(int k=0; k<n; k++)
                 {
                    if( i != j && i!= k && j != k)
                      {
                        System.out.println(str.charAt(i) + str.charAt(j) + str.charAt(k));
                      }
                 }
         }

      }
 }

}
public class StringQuestion
  {
     public static void main(String args[])
       {
         
          A obj = new A();
        
         Scanner sc = new Scanner(System.in);
    
         System.out.println("Enter the String...");
         String st = sc.nextLine();

         System.out.println("All combination of string :: " + obj.generatePermutation(st));

       }
  }

*/





















public class StringQuestion
      {
         public static void main(String args[])
           {

             String str = "ABC";
             generatePermutation(str);

 }
        static void generatePermutation(String str)
         {
        int n = str.length();

        for(int i=0; i<n; i++)
         {
           for(int j=0; j<n; j++)
             {
              for(int k=0; k<n; k++)
                 {
                    if( i != j && i!= k && j != k)
                      {
                        System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                      }
                 }
         }

      }
 
 }
}