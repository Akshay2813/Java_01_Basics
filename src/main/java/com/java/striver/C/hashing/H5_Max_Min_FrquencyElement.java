package com.java.striver.C.hashing;

import java.util.HashMap;

public class H5_Max_Min_FrquencyElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 1, 1, 5, 10, 11, 1, 11, 10, 1, 15, 10, 10};
        System.out.println(Max_FrequencyElementInArr(arr));
    }

    public static int Max_FrequencyElementInArr(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = hashMap.getOrDefault(arr[i], 0);
            hashMap.put(arr[i], count + 1);
        }
        int maxVal = 0;
        int elementOccurMost = 0;
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > maxVal) {
                maxVal = hashMap.get(key);
                elementOccurMost = key;
            }
        }
        System.out.println(hashMap);
        return elementOccurMost;
    }
}
