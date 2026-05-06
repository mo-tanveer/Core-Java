//Autoboxing vs Unboxing

package com.app;
import java.util.*;

public class Third{
public static void main(String args[])
{

	List<Integer> list = new ArrayList<Integer>();
	
	list.add(1);
	list.add(2); //list.add(new Integer(2)) // conversion of primitive type into object type is known as Autoboxing
	list.add(3);

	System.out.println("List::" + list);


        int a = list.get(1); //unboxing -> conversion of object oriented type into primitive type
	System.out.println("a::" + a);
}
}

