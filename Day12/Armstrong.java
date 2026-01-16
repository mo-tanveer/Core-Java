import java.util.*;
import java.lang.Math;
 class A
    {
      void Arm(int num) 
      {

        int temp = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
   
        while(temp > 0)
         {
           int rem = temp%10;
           //int cube = rem*rem*rem; //its only for 3 digits
            //sum = sum + cube;

           sum += (int)Math.pow(rem, digits);   //Math.pow always return value in double like 125.0 so we convert double into int for dont lossy precision
           temp = temp/10;
        }
          if(sum == num)
            {
               System.out.println(sum + " is Armstrong Number");
            }
          else
            {
               System.out.println(sum + " is not Armstrong Number");
            }
      }

}


 public class Armstrong
      {
        public static void main(String args[])
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number...");
            int value = sc.nextInt();

           A obj = new A();
           obj.Arm(value);

}

}