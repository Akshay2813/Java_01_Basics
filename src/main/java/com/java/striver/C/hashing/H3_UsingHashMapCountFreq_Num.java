package com.java.striver.C.hashing;

import java.util.HashMap;

public class H3_UsingHashMapCountFreq_Num {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,1,1,5,10,11,1,11,10,1,15,10,10};
        System.out.println(countFrequencyOfElementInStr(arr, 10));
    }

    public static int countFrequencyOfElementInStr(int[] arr, int element) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<arr.length;i++)
        {
            int count = hashMap.getOrDefault(arr[i],0);
            hashMap.put(arr[i], count+1);
        }
        System.out.println(hashMap);
        return hashMap.get(element);
    }
}
