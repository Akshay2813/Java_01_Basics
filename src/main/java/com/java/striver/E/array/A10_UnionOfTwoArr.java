package com.java.striver.E.array;

import java.util.Arrays;
import java.util.HashSet;

public class A10_UnionOfTwoArr {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 2, 3, 4, 7, 7, 7, 8};
        unionOfTwoArr_BruteForce(arr1, arr2);
        unionOfTwoArr_Optimal(arr1,arr2);
    }

    public static void unionOfTwoArr_BruteForce(int[] arr1, int[] arr2) {
        HashSet<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            tempSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            tempSet.add(arr2[i]);

        }
        System.out.println(tempSet);
    }

    //Two arr are SORTED ARR
    public static void unionOfTwoArr_Optimal(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (k == 0 || resultArr[k - 1] != arr1[i]) {
                    resultArr[k] = arr1[i];
                    k++;
                }
                i++;
            } else {
                if (k == 0 || resultArr[k - 1] != arr2[j]) {
                    resultArr[k] = arr2[j];
                    k++;
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (k == 0 || resultArr[k - 1] != arr1[i]) {
                resultArr[k] = arr1[i];
                k++;
            }
            i++;
        }
        while (j < arr2.length) {
            if (k == 0 || resultArr[k - 1] != arr2[j]) {
                resultArr[k] = arr2[j];
                k++;
            }
            j++;
        }
        System.out.println(Arrays.toString(resultArr));

    }
}
