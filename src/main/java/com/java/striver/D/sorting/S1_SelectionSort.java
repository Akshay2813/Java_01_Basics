package com.java.striver.D.sorting;

import java.util.Arrays;

public class S1_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) //5 4 3 2 1
        {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            //we get minElement here
            int temp = arr[i];
            arr[i] = arr[minElementIndex];
            arr[minElementIndex] = temp;
        }
    }
}