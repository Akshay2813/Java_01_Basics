package com.java.striver.C.hashing;

import java.util.Arrays;

public class H1_CountElement_Frequency_Num {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 5, 7, 10};
        System.out.println(countFrequencyOfElement(arr, 5));
    }

    public static int countFrequencyOfElement(int[] arr, int element) {
//        int[] hashArr= new int[12];

        int maxVal = 0;
        for (int i : arr) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        int[] hashArr = new int[maxVal + 1];

        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] = hashArr[arr[i]] + 1;
        }
        System.out.println(Arrays.toString(hashArr));

        return hashArr[element];
    }
}
