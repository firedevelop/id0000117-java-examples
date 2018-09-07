package com.company;
        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.concurrent.ThreadLocalRandom;

public class java_05_15 {
    public static void main(String[]args){
        ArrayList<Integer> matrix=new ArrayList<Integer>();
        int size = ThreadLocalRandom.current().nextInt(1, 10+1);
        for(int i=0; i<size; i++){
            int num = ThreadLocalRandom.current().nextInt(1,10+1);
            matrix.add(num);
        }
        System.out.println("Array: " + matrix);
        Collections.sort(matrix);
        System.out.println("Array sorted: " + matrix);
        System.out.println("Highest number: " + matrix.get(size-1));
    }
}