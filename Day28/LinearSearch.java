package com.app;

public class LinearSearch
 {
   static int linearS(int a[],int x)
    {
       for(int i=0; i<a.length; i++)
        {
          if(a[i] == x)
           {
             return i;
           }
        }
       return -1;
     }

   public static void main(String args[])
    {
        int a [] = {5,6,7,9,12,14,54};
        
      
        int res = linearS(a,12);
   
        if(res == -1)
          {
             System.out.println("The Number is not present in the array.");
          }
         else
          {
             System.out.println("The Number is present on the index ::" + res);
          }

    }


 }