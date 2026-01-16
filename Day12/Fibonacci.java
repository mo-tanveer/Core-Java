import java.util.*;
class Fibo 
  {
    
       void printFibonacci(int num)

         {
 
             int a =0, b=1;
            System.out.println("Fibonacci series: " + a + " " + b);


          for( int i=2; i<num; i++)
            {
              int c = a+b;
              System.out.println(" " + c);

                a = b;
                b = c;
            }
          

         }
  }
 

  public class Fibonacci 
    {
       public static void main(String args[])
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number ...");
             int value = sc.nextInt();

            Fibo obj = new Fibo();
            obj.printFibonacci(value);
  

          }
    }
   