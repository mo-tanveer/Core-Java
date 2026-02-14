package com.app;

import java.io.*;

public class MarkAndReset
   {
     public static void main(String args[]) throws Exception

     {        
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));

        System.out.println("Is current stream is supporting the mark facility :: " + bis.markSupported());

       System.out.println((char)bis.read());
       Thread.sleep(1000);
       System.out.println((char)bis.read());
       Thread.sleep(1000);

       System.out.println((char)bis.read());
       Thread.sleep(1000);

       System.out.println((char)bis.read());
       Thread.sleep(1000);

       System.out.println((char)bis.read());
       Thread.sleep(1000);

       System.out.println("Applying the marks here.....");
        Thread.sleep(1000);

       bis.mark(2);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

       System.out.println("Resettig.....");
        Thread.sleep(1000);

       bis.reset();

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());
       Thread.sleep(1000);

      System.out.println((char)bis.read());  //4<10 true
       Thread.sleep(1000); 

 bis.close();

     }


   }