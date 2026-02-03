package com.app;

import java.io.*;

public class Third{
     
       public static void main(String args[]){


       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the name: ");

try{

  String name = br.readLine();
System.out.println("Hello.. "  + name );
}

catch(IOException e){

         System.out.println("The error ::" + e.getMessage());
      }

}
}