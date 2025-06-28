package com.java.basics.array.basics;

import java.util.Arrays;

public class Program_03_ReverseArr {

    public static void main(String[] args) {
        System.out.println("reverse of Array is " + Arrays.toString(reverseArr(new int[]{100, 200, 300,400})));

    }


    public static int[] reverseArr(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}