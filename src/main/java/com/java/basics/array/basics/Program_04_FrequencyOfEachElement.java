package com.java.basics.array.basics;

import java.util.HashMap;
import java.util.Map;

public class Program_04_FrequencyOfEachElement {

    public static void main(String[] args) {
        frequencyOfEachElement(new int[] {1,1,2,1,2,2,2,2,3,3,1,1,1});
    }


    public static void frequencyOfEachElement(int[] arr) {

        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int count = resultMap.getOrDefault(arr[i],0);
            resultMap.put(arr[i],count+1);
        }
        System.out.println(resultMap);
    }
}