package com.app;


interface Iface
   {
     
     int calculateVolume(int length, int breadth, int heigth);

   } 

public class Fifth
   {
    public static void main(String args[])
     {
       Iface obj =(length,breadth,heigth)->(length*breadth*heigth);


       System.out.println(obj.calculateVolume(10,20,30));

     }


   }