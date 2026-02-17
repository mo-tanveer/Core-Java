package com.app;
 
public class Permutation
 {
   static void generatePermutation(String str)
    {
        int n = str.length();
  
      for(int i=0; i<n; i++)
        {
          for(int j=0; j<n; j++)
            {
              for(int k=0; k<n; k++)
                {
                   if(i != j && i != k && j != k )
                    {
                       System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                    }
                }
            }
        }
    }

public static void main(String args[])
      {
        String str = "bat";
        generatePermutation(str);
      }
 }