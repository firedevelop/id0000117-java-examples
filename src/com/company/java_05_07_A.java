package com.company;

public class java_05_07_A {

        public static void main(String args[])
        {
            int a[]={2,5,1,4,2,1};
            sortingArray(a);
        }
        private static void sortingArray(int []a){
Ω            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a.length-1;j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j+1];
                        a[j+1]=a[j];
                        a[j]=temp;
                    }
                }
            }
            for(int i=0;i<a.length;i++){
                System.out.println("array is"+a[i]);
            }

        }
    }


