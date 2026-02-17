package com.app;

import java.io.*;

public class Second
  {
    public static void main(String args[]) throws IOException
     {
        
       InputStream ins = new FileInputStream("source.txt");
       OutputStream ous = new FileOutputStream("sink.txt");
       

       int ascii = 0;
  
       while((ascii = ins.read()) != -1)
        {
           ous.write(ascii);
           
         }

        System.out.println("Data written on sink");

       ous.close();
       ins.close();
     }

  }