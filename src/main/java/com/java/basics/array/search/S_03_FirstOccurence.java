package com.java.basics.array.search;

import java.util.Arrays;

public class S_03_FirstOccurence {

    public static void main(String[] args) {
        int[] arr = {100, 100, 100, 300, 300, 300, 500, 600, 600, 600, 1000};
        int target = 600;

        System.out.println("Target element = " + target + " occured FIRST in array  " + Arrays.toString(arr) + " at index = " + firstOccurence(arr, target));
    }

    public static int firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int answer = -1;
        while (start <= end) {
            if (arr[mid] == target) {
                answer = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;
        }
        return answer;
    }
}

