package com.app;

import java.util.*;


public class Second{

    public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age :: ");
       int age = sc.nextInt();


       try{
              if(age<18)
                {
                  throw new MyException();
                }
              else
                {
                   System.out.println("Age has been accepted for voting");
                }
         }
        catch(MyException e)
                {
                     System.out.println("Exception raised :: " + e.getMessage());
                }
    }
}