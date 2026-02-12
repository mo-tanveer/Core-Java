package com.app;
import java.io.*;

public class First
 {
   public static void main(String args[])
     {
       try
         { 
           InputStream ins = new FileInputStream("First.java");

 // int ascii = ins.read();
  //System.out.println(ascii);

   int ascii = 0;
   while ((ascii=ins.read()) != -1)
      {
         System.out.print((char)ascii);
      }
   ins.close();

         }

   catch(IOException e)
      {
        System.out.println("Reason of Error :: " + e.getMessage());
      }

     }


 }