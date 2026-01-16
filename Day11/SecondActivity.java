class A 
  {
    int calculateArea(int l, int b) // Formal Parameter
   {
     int area = l * b;
      return area;

  }

}

public class SecondActivity 
  {
   
    public static void main(String args[])
{
     
     A obj = new A();
    System.out.println("Area = " + obj.calculateArea(10,20));  //Actual Parametrer

  }
}