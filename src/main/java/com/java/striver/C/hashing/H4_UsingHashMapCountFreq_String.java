package com.java.striver.C.hashing;

import java.util.HashMap;

public class H4_UsingHashMapCountFreq_String {

    public static void main(String[] args) {
        String str = "aabbcddeebbbbfb";
        System.out.println(countFrequencyOfElementInStr(str, 'b'));
    }

    public static int countFrequencyOfElementInStr(String str, char element) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0; i<str.length();i++)
        {
            int count = hashMap.getOrDefault(str.charAt(i),0);
            hashMap.put(str.charAt(i), count+1);
        }
        System.out.println(hashMap);
        return hashMap.get(element);
    }
}
