package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class java_05_07_D_Example_ArrayList {
    public static void main(String[] args)
            throws IOException
    {
      ArrayList<Integer> a=new ArrayList<Integer>();
      for(int i=0; i<=10; i++){
          a.add(i);

      }
        a.add(11);
        System.out.println(a);
        System.out.println("Size: " + a.size());

        a.remove(11);
        System.out.println(a);
        System.out.println("Size: " + a.size());
    }
}
