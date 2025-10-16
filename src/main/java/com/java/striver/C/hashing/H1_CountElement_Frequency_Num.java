package com.java.striver.C.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class H1_CountElement_Frequency_Num {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 5, 7, 10};
        System.out.println(countFrequencyOfElement(arr, 5));
        System.out.println(countFrequencyOfElement_UsingMap(arr, 5));

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


    //Using map
    public static int countFrequencyOfElement_UsingMap(int[] arr, int element) {

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int count = mp.getOrDefault(arr[i], 0);
            mp.put(arr[i], count+1);
        }

        for(int k: mp.keySet())
        {
            if(k==element)
            {
                return mp.get(k);
            }
        }
        return -1;

    }
}
