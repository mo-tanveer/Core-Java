package com.app;
import java.util.*;

class A
  {
    boolean checkNiven(int num)
      {
         int temp = num;
         int sum = 0;
        while(temp > 0)
         {
           int rem = temp%10;
           sum = sum + rem;
           temp = temp/10;
         }
       if(num%sum == 0)
          return true;
          else
         return false;    
      }
  }

class B
{
    long calculateFactorial(int num)
    {
        long result = 1;

        for(int i = 1; i <= num; i++)
        {
            result = result * i;
        }

        return result;
    }
}
class C
  {
    boolean checkPrime(int num)
     {
         boolean isPri = true;
 
      for(int i=2; i<num; i++)
        {
           if(num%i == 0)
             {
              isPri = false;
              break;
             }
        }
       return isPri;
     }
  }

public class AllInOne
 {
     public static void main(String args[])
      {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();

        System.out.println("The number is Niven: " + ob1.checkNiven(value));

 System.out.println("Factorial of the " + value +":"+ ob2.calculateFactorial(value));

 System.out.println("The number is Prime: " + ob3.checkPrime(value));
      }
 }