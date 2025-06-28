package com.java.basics.array.search;

public class S_06_SearcnInNearlySortedArr {

    public static void main(String[] args) {

        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 10;
        // If arr is sorted then 3 10 20 40 50 80 70 i.e ith element present either at i /i+1/ i-1
        System.out.println(searchInNearlySortedArr(arr, target));
    }

    public static int searchInNearlySortedArr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid - 1] == target) {
                return mid - 1;
            }
            if (arr[mid + 1] == target) {
                return mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}

