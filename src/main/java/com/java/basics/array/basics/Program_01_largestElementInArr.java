package com.java.basics.array.basics;

public class Program_01_largestElementInArr {

    public static void main(String[] args) {
        System.out.println("Largest Element in Array is " + largestElementInArr(new int[] {100,50,200,300,400}));
//       System.out.println( reverseInt(1000));

    }


    public static int largestElementInArr(int[] arr) {
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }
}