// Object state ko file me write karta hai
package com.app;
import java.io.*;

public class SerializeIt
  {
     public static void main(String args[]) throws Exception
       {
           Room obj = new Room(10,30);

   ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("test.ser"));

   ous.writeObject(obj);
   ous.close();

 System.out.println("Object has been Searialized");

       }
  }