package com.java.striver.C.hashing;

import java.util.Arrays;

public class H2_CountElement_Frequency_String {
    public static void main(String[] args) {
        String str = "aabbcddeebbbbfb";
        System.out.println(countFrequencyOfElementInStr(str, 'b'));
    }

    public static int countFrequencyOfElementInStr(String str, int element) {
        int[] hashArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            hashArr[str.charAt(i)-'a'] = hashArr[str.charAt(i)-'a'] + 1;
        }
        System.out.println(Arrays.toString(hashArr));
        return hashArr[element -'a'];
    }
}
