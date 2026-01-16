import java.util.*;

 class Pali
   {
      boolean isPalindrome(int num)
     {
        int temp = num;
        int reverse = 0;
  
        
         while(temp > 0)
          {
              int rem = temp% 10;        //Extract last digit
              reverse = reverse * 10 + rem;
              temp = temp/10;         //remove last digit
         
          }
            if(reverse == num)
              {
                 return true;
              }
            else
              {
                 return false;
              }

     }
}

public class Palindrome 
   {
     public static void main(String args[])
     {
   
       Pali obj = new Pali();
  
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number....");
       int value = sc.nextInt();
  
      System.out.println("The Number " + value +" is Palindrome :: " + obj.isPalindrome(value));

  }
} 