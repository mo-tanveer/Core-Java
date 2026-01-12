public class Palindrome 
   {
       public static void main(String args[])
        {
          int value = Integer.parseInt(args[0]);
          int temp = value;
          int reverse = 0;

        while( temp > 0)
         {
           int rem = temp % 10;
           reverse = reverse * 10 + rem;
           temp = temp/10;
         }
        
           System.out.println("reverse " + reverse);
            
           if(value == reverse)
             {
               System.out.println(value + " is Palindrome number");
             }
           else
             {
               System.out.println(value + " is not Palindrome number");
             }
  }
}