 import java.util.*;

class Niven
 {
   
   boolean isNiven(int num)
    {
      int temp = num;
      int sum = 0;

while (temp > 0)
  {
    int rem = temp%10 ;
     sum = sum + rem;
    temp = temp/10;
}

  if (num % sum==0)
   {
     return true;
   }
  else {
         return false;
       }

    }
}


public class NivenNumber 
  {
    public static void main(String args[])
    {
       
     Niven obj = new Niven();
     Scanner sc = new Scanner(System.in);
     int value = sc.nextInt();
     System.out.println("The Number "+ value +" is NivenNumber :: "+ obj.isNiven(value));
  
   }
 }