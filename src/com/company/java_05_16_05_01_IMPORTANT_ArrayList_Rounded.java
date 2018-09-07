package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class java_05_16_05_01_IMPORTANT_ArrayList_Rounded {
    public static void main(String[] args){
        ArrayList<Double> salary=new ArrayList<Double>();
        int NumberPersonSurveyed = ThreadLocalRandom.current().nextInt(1, 10+1);
        for(int i=0; i<NumberPersonSurveyed; i++){
            double salaryPerson = ThreadLocalRandom.current().nextInt(100 * 1000, 100 * (10000 + 1)) / 100d;
            salary.add(salaryPerson);

        }

        Collections.reverse(salary);
        System.out.println("Salaries decreasing: " + salary);

        System.out.println("Min Salary: " + salary.get(0));
        System.out.println("Max Salary: " + salary.get(NumberPersonSurveyed-1));

        double total=0;
        for(int i=0; i<NumberPersonSurveyed; i++){
            total+=salary.get(i);
        }
        System.out.println("Salary average: " + (total/NumberPersonSurveyed));
    }
}