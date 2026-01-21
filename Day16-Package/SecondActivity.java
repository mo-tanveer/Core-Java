package com.app;

import shape.circle.*;
import shape.rectangle.*;
import shape.square.*;

public class SecondActivity

  {
     public static void main(String args[])
       {
       Circular cir = new Circular();
       Rectangular rec = new Rectangular();
       Squarer sqr = new Squarer();

    System.out.println("Area of Sphere :: " + cir.calculateAreaSphere(10));

    System.out.println("Area of cuboid :: " + rec.calculateAreaCuboid(5,5,5));

     System.out.println("Area of sqaure :: " + sqr.calculateAreaSquare(5));
     }
  }