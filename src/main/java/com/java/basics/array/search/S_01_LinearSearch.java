package com.java.basics.array.search;

import java.util.Arrays;

public class S_01_LinearSearch {

    public static void main(String[] args) {
        int[] arr = {100, 300, 500, 600, 0, 400};
        int target = 500;

        System.out.println("Target element = " + target + " found in arr " + Arrays.toString(arr) + " at index = " + linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

