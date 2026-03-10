package com.app;
import java.util.*;

public class Insertion{
    public static void main(String args[]){
	
        int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the elements....");
	
	for(int i=0; i<a.length; i++)
	  {
	     a[i] = sc.nextInt();
	  }
	for(int i=1; i<a.length; i++)
	  {
	    int temp = a[i];
	    int j = i-1;  //0
     
 	    while(j>=0 && a[j] > temp)
              {
	         a[j+1] = a[j];
		 j--;
	      }
	       a[j+1] = temp;

	  }

         System.out.println(".......The Array is sorted....");
      	  
	  for(int value : a)
	   {
	      System.out.println(value);	
 	   }
	}
	}
	