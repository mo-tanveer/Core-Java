package shape.rectangle;

public class Rectangular
      {
        public int calculateAreaRectangle(int length, int breadth)
     {
         return length * breadth;
       }


      public int calculateAreaCuboid(int length, int breadth, int height)
    {
       return 2 * (length * breadth + length* height + breadth* height);
    }
      
}