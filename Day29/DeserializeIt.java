//File me se object state ko read karta hai

package com.app;
import java.io.*;

public class DeserializeIt
  {
     public static void main(String args[]) throws Exception
      {
          FileInputStream fis = new FileInputStream("test.ser");

          ObjectInputStream ois = new ObjectInputStream(fis);

    
        Object o = ois.readObject();
          Room room = (Room)o; // Explicit downcasting

     
        System.out.println("Length=" + room.length);
        System.out.println("Breadth=" + room.breadth);
      }

  }