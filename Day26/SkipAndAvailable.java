package com.app;

import java.io.*;

public class SkipAndAvailable
  {
   public static void main(String args[]) throws IOException
     {
        InputStream ins = new FileInputStream("source.txt");

         System.out.println("Number of character available in stream ::" + ins.available());

ins.skip(2);

int ascii = ins.read();
System.out.println(ascii);
System.out.println((char)ins.read());
 
    ins.close();
     
     }
  }