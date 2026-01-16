 
 import java.util.*;
 class Fact 
  {
     long calculateFactorial(int num)
     {
        long result = 1;
        for(int i=1; i<=num; i++)
          {
            result = result*i;
          }
         return result;
     }
  }

  public class Factorial
   {
     public static void main(String args[])
     {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int value = sc.nextInt();
   
        Fact obj = new Fact();
       System.out.println("Factorial ::" + obj.calculateFactorial(value));

      }
   }