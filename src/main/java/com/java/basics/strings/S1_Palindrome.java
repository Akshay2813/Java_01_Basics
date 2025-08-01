package com.java.basics.strings;

public class S1_Palindrome {

    public static void main (String[] args)
    {
       System.out.println(checkIfPalindrome("MADAM"));
    }

    public static boolean checkIfPalindrome(String str)
    {
        String reveserString="";
        for(int i=0; i<str.length();i++)
        {
            reveserString=str.charAt(i) + reveserString;
        }
        if(reveserString.equals(str))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
