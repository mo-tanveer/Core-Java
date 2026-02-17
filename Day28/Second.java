package com.app;
import java.io.*;

public class Second
 {
   public static void main(String args[])  throws IOException
    {
      String line = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
      byte[] buffer = line.getBytes();

     OutputStream ous = new FileOutputStream("sink.txt");

       ous.write(buffer,2,1);
       ous.close();
System.out.println("Data is written on to the sink");
    }
 }