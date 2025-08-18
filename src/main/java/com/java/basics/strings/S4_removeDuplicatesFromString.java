package com.java.basics.strings;

public class S4_removeDuplicatesFromString {

//    Remove Duplicates
//    From "aabbcc" → "abc"

    public static void main(String[] args)
    {
        String str = "aabbcc";
        System.out.println(removeDuplicatesFromStr(str));
    }

    public static String removeDuplicatesFromStr(String str)
    {
        int i=0;
        String ans= String.valueOf(str.charAt(i));
        for(int j=1; j<str.length();j++)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                ans=ans + str.charAt(j);
            }
            i++;
        }
        return ans;
    }
}
