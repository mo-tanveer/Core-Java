package com.app;
import java.io.*;

class A {

   public void inputByUser() throws IOException
    {
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the name..");

      String name = br.readLine();
     System.out.println("Hello "+ name);
     
   }

  }

 public class Fifth{
   public static void main(String args[]) //throws IOException
   {
     
    A obj = new A();
 
 try{
       obj.inputByUser();  //caling
}
catch(IOException e){
   System.out.println("Erro occured...");
 }
  
  }
 }