package com.java.basics.strings;

import java.util.Stack;

public class S7_LongestSubStrWithoutRepeatingChar {

    public  static void main(String[] args)
    {
        longestSubStrWithoutRepeatingChar("aabbbCCCde");
    }

    public static String  longestSubStrWithoutRepeatingChar(String str)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0 ;i <str.length() ; i++)
        {
            if(st.isEmpty())
            {
                st.push(str.charAt(i));
            }
            else if (st.peek() != str.charAt(i))
            {
                st.push(str.charAt(i));
            }
        }

        System.out.println(st);
        String ans = "";
        for(Character ch : st)
        {
            ans=ans+ch;
        }
        return ans;
    }


}
