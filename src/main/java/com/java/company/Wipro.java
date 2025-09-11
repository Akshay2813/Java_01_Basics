package com.java.company;

import java.util.Arrays;

public class Wipro {
    public static void main(String[] args)
    {
        String str= "automation";
        printCharGreaterThanOneTime(str);
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
}
