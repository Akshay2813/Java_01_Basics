package com.java.basics.array.basics;

public class Program_02_SecondLargestElementInArr {

    public static void main(String[] args) {
        System.out.println("Second Largest Element in Array is " + secomdLargestElementInArr(new int[]{100, 50, 200, 300, 400}));

    }


    public static int secomdLargestElementInArr(int[] arr) {
        int max_val = Integer.MIN_VALUE;
        int secondMaxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val) {
                secondMaxVal = max_val;
                max_val = arr[i];
            } else if (arr[i] < max_val && arr[i] > secondMaxVal) {
                secondMaxVal = arr[i];
            }
        }

        return secondMaxVal;
    }
}