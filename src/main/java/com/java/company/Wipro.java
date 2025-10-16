package com.java.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Wipro {
    public static void main(String[] args)
    {
        String str= "automation";
//        printCharGreaterThanOneTime(str);
        hasMapUsing(str);
    }

    public static void printCharGreaterThanOneTime(String str)
    {
        int[] ch = new int[26];
        for(int i=0 ;i<str.length();i++)
        {
            ch[str.charAt(i)-'a'] =   ch[str.charAt(i)-'a']+1;
        }

        System.out.println(Arrays.toString(ch));

        for(int i=0 ;i<ch.length;i++)
        {
            if(ch[i]>1)
            {
                System.out.print(((char) (i+'a') )+ " ");
            }
        }
    }

    public static void hasMapUsing(String str)
    {
        Map<Character,Integer> mp = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++)
        {
//            int count = mp.getOrDefault(str.charAt(i), 0);
//
//            mp.put(str.charAt(i), count+1);

            char ch=str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);
    }
}
