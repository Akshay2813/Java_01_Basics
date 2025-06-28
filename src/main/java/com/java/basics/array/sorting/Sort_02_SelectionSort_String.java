package com.java.basics.array.sorting;

import java.util.Arrays;

public class Sort_02_SelectionSort_String {

    public static void main(String[] args) {
        String[] arr = {"Zebra", "Ant", "Dog", "cat", "frog"};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}