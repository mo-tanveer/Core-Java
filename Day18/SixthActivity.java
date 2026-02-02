// we use diffrent package for testing
package com.another;   

import com.app.*;


public class SixthActivity extends Room5
  {
    public static void main(String args[])
     {
       SixthActivity obj = new SixthActivity(); 
       System.out.println("Length=" + obj.length);
       obj.sayHello();

       SixthActivity.Chamber obj_chamb = new SixthActivity().new Chamber();

     }
  }