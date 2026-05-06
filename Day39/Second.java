//Sorting in Collection by Lengthwise and Breadthwis

package com.app;
import java.util.*;

class Room{

	int length;
	int breadth;

	Room(int l,int b)
        {
	    length = l;
	    breadth = b;
        }

public String toString()
  {
     return "(Room with length=" + length + " and breadth=" + breadth +")";
 
  }
}
class LengthWise implements Comparator<Room>
   {
	public int compare(Room o1, Room o2)
	 {
           return o1.length - o2.length;
	 }	
   }

class BreadthWise implements Comparator<Room>
   {
	public int compare(Room o1, Room o2)
	 {
           return o1.breadth - o2.breadth;
	 }	
   }

public class Second{
public static void main(String args[]) throws Exception{

	LengthWise lengthWise = new LengthWise();
	BreadthWise breadthWise = new BreadthWise();

	SortedSet<Room> sset = new TreeSet<Room>(breadthWise);    //u can check Breadthwise also to put ->breadthWise in  ()

	Room obj = new Room(10,20);
	Room obj1 = new Room(5,25);
	Room obj2 = new Room(7,12);
	Room obj3 = new Room(11,4);
	Room obj4 = new Room(1,2);

	sset.add(obj);
	sset.add(obj1);
	sset.add(obj2);
	sset.add(obj3);
	sset.add(obj4);

	//Iterator for better output and use sleep() //Not mandatory

	Iterator itr = sset.iterator();
	
	while(itr.hasNext())
	 {
	   System.out.println(itr.next());
             Thread.sleep(1000);		  
	 }
}
}