package com.java.basics.array.basics;

import java.util.Arrays;

public class Program_06_Sort_0_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort_0_1(new int[]{0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1})));

    }


    public static int[] sort_0_1(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] == 0) {
                low++;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}