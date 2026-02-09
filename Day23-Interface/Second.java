package com.app;

import java.util.*;

abstract class ShapeArea
  {
     public abstract double calculateAreaSphere(int num);
     public abstract double calculateAreaCircle(int radius);

  }


class Test2 extends ShapeArea
    {
      public double calculateAreaSphere(int radius)
       {
           return 4*Math.PI*radius*radius;
       }

     public double calculateAreaCircle(int radius)
       {
          return Math.PI*radius*radius;
       }

   }


public class Second
  {
    public static void main(String args[])
     {


      ShapeArea obj = new Test2();


       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius for sphere");
       int val = sc.nextInt();
      System.out.println("Area of Shpere: " + obj.calculateAreaSphere(val));


       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the radius for circle");
       int value = scan.nextInt();
      System.out.println("Area of Circle: " + obj.calculateAreaCircle(value));

     }


  }