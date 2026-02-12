package com.app;

import java.io.*;

public class Second
   {
     public static void main(String args[])
      {
         try
           {
              InputStream ins = new FileInputStream("source.txt");

              byte [] buffer = new byte[26];
       
              int noc = ins.read(buffer);

           System.out.println("No of character read at a time :: " + noc);

              for(byte b : buffer)
                {
                   System.out.println((char)b);
                }
           }

         catch(IOException e) 
               {
                 System.out.println("Reason of Error :: " + e.getMessage());
               }
      }
  }