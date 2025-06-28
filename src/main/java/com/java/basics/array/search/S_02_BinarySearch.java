package com.java.basics.array.search;

import java.util.Arrays;

public class S_02_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500, 600, 700};
        int target = 500;

        System.out.println("Target element = " + target + " found in arr using Binary Search " + Arrays.toString(arr) + " at index = " + binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}

