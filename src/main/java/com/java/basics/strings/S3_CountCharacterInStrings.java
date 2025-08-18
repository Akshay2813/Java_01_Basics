package com.java.basics.strings;

import java.util.HashMap;
import java.util.Map;

public class S3_CountCharacterInStrings {

    public static void main(String[] args)
    {
        String str = "automation";
        char ch = 'a';
        System.out.println(countCharInStr(str, ch));
    }

    public static int countCharInStr(String str, char ch)
    {
        Map<Character, Integer> tempMap = new HashMap<>();
        for(int i=0; i<str.length();i++)
        {
            int count = tempMap.getOrDefault(str.charAt(i), 0);
            tempMap.put(str.charAt(i),count+1);
        }
        System.out.println(tempMap);

        for(char c : tempMap.keySet())
        {
            if(c==ch)
            {
                return tempMap.get(c);
            }
        }
        return -1;
    }
}
