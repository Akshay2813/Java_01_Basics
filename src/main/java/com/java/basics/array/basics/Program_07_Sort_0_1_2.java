package com.java.basics.array.basics;

import java.util.Arrays;

public class Program_07_Sort_0_1_2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort_012(new int[]{0, 1, 1, 0, 1, 0, 2, 2, 2, 1, 0, 0, 0, 0, 1})));

    }


    public static int[] sort_012(int[] arr) {
        int low = 0;
        int medium = 0;
        int high = arr.length - 1;
        while (medium <= high) {
            if (arr[medium] == 0) {
                int temp = arr[medium];
                arr[medium] = arr[low];
                arr[low] = temp;
                low++;
                medium++;
            } else if (arr[medium] == 1) {
                medium++;
            } else if (arr[medium] == 2) {
                int temp = arr[medium];
                arr[medium] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}