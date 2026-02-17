package com.app;

public class BinarySearch
    {
      static int binaryS(int arr[], int s, int e, int x)
        {

          
          while(e > s) 
           {
          int mid = (s + e)/2;
  
          if(arr[mid] == x)
           {
             return mid;
           }  
           else if(arr [mid] > x)
             {
                s = mid-1;
             }  
            else
             {
               e = mid + 1;
             }    
         }
       return -1;
       }

  public static void main(String args[])
     {
        int a[] = {2,5,7,8,12,34,45};
        int n = a.length;
        int x = 4;

       int res = binaryS(a, 0, n-1,x);
     
       if(res == -1)
          {
            System.out.println("The Number is not present is the array");
          }
        else
          {
            System.out.println("The Number is present on index:: " + res);

          }


     }

    }