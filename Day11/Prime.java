import java.util.*;
class A 
   {
       boolean isPrime(int num)
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


      public class Prime 
        {
          public static void main(String args[])
           {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            int value = sc.nextInt();

           A obj = new A();
           System.out.println("Is " + value +" Prime = " + obj.isPrime(value));
           }
 }