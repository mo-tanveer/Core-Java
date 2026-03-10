package com.app;

class Bin
  {
    int BinarySearch(int arr[], int low, int high, int x)
      {
         
         
         while(high >= low)
           {
              int mid = (low + high)/2;
	      if(arr[mid] == x)
               {
		  return mid;
		}
	       else if(arr[mid] > x)
                {
	 	   high = mid-1;
		}
		else
		{
	           low = mid+1;
		}
	   }
	return -1;
      }
  }

public class Binary
   {
     public static void main(String args[])
	{
           Bin obj = new Bin();
          int arr[] =  {2,5,7,8,12,34,45};
          int x = 12;
         
         int res = obj.BinarySearch(arr,0,arr.length-1,x);

         if(res == -1)
	   {
		System.out.println("The Array is not sorted or The number is not present");
           }
	  else
	   {
	      System.out.println("The Number is present on this index : " + res);
	   }

        }	
   }	