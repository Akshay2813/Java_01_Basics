package com.java.striver.E.array;

import java.util.*;

public class A4_RemoveDuplicatesFromSortedArr {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
//        removeDuplicatesFromSortedArr_BruteForce(arr);
        System.out.println(removeDuplicatesFromSortedArr_Optimal(arr));

    }

    public static void removeDuplicatesFromSortedArr_BruteForce(int[] arr) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        System.out.println(result);
    }

    public static int removeDuplicatesFromSortedArr_Optimal(int[] arr) {
//        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
//        that each unique element appears only once. The relative order of the elements should be
//        kept the same.
//        Then return the number of unique elements in nums.
//        Consider the number of unique elements of nums to be k, to get accepted,
//        you need to do the following things:
//        Change the array nums such that the first k elements of nums contain the unique elements in the order
//        they were present in nums initially. The remaining elements of nums are not important as well as
//        the size of nums.Return k.

        //1 1 2 2 3
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
//                arr[i + 1] = arr[j];
//                i = i + 1;
                i=i+1;
                arr[i]=arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
}
