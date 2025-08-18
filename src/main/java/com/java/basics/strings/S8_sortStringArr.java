package com.java.basics.strings;

import java.util.Arrays;

public class S8_sortStringArr {

    public static void main(String[] args) {
        String[] str = {"xyz", "ABC", "abc"};
        System.out.println(Arrays.toString(str));
        sortString(str);
        System.out.println(Arrays.toString(str));


    }

    public static void sortString(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            //we get minIndex here
            String temp = str[i];
            str[i] = str[minIndex];
            str[minIndex] = temp;
        }
    }
}
