package com.java.basics.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class S5_FirstNonRepeatingCharacter {

    //    Find First Non-Repeating Character
//    "swiss" → 'w'
    public static void main(String[] args) {

        String str = "swiss";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str) {

        Map<Character,Integer> tempMap = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++)
        {
            int count = tempMap.getOrDefault(str.charAt(i), 0);
            tempMap.put(str.charAt(i), count+1);
        }

        System.out.println(tempMap);
        for(Map.Entry<Character,Integer> m : tempMap.entrySet())
        {
            if(m.getValue()==1)
            {
                return m.getKey();
            }
        }
        return '-';
    }
}