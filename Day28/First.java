package com.app;
import java.io.*;
import java.util.*;

public class First
 {
    public static void main(String ags[]) throws Exception
      {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the text::");
     String line = sc.nextLine();

     byte[] buffer = line.getBytes();

  OutputStream ous = new FileOutputStream("sink.txt");
     ous.write(buffer);
     ous.close();

   System.out.println("Data is written on the sink file");
     }

 }