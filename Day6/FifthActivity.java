
/* public class FifthActivity {
    public static void main(String args[])

   {
     int i = 1;

   for(;i<=10;i++)
       {
          System.out.println("i=" + i);
       }
}

} 
*/

public class FifthActivity
  {

    public static void main(String args[])
   
 {
     for(int i=1; i<=10; i++)
  
      {
       if(i == 5 || i == 8)
       {
          //break;                // then the loop will stop at 5
            continue;             // then the loop will skip number 5 and number 8 
       } 
        System.out.println(i);
      }

        System.out.println(" ....out of loop.....");
}
}

