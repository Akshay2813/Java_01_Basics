package com.java.basics.strings;

import java.util.Arrays;

public class S9_sortString {

    public static void main(String[] args) {
        String str = "xyzABCabc";
        System.out.println(str);
        sortCharArr(str.toCharArray());
    }

    public static void sortCharArr(char[] charArr) {
        for (int i = 0; i < charArr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[j] <=(charArr[minIndex]) ) {
                    minIndex = j;
                }
            }
            //we get minIndex here
            char temp = charArr[i];
            charArr[i] = charArr[minIndex];
            charArr[minIndex] = temp;
        }
        System.out.println(new String(charArr));

    }
}
