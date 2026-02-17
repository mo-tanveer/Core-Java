package com.app;

import java.util.*;
import java.io.*;

public class First
  {
    public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
         String value = sc.nextLine();

       try
         {
           OutputStream ous = new FileOutputStream("sink.txt");

           for(int i=0; i<value.length(); i++)
            {
                int ascii = value.charAt(i);
                ous.write(ascii);
 
            }
            ous.close();
          System.out.println("Data written to sink!");

         }
         catch(Exception e)
            {
              System.out.println("Reason for error:: " + e.getMessage());
            }
    
  
      }


  }