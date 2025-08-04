package com.java.striver.B.basicrecursion;

public class R7_CheckPalindrome {

    public static void main(String[] args)
    {
        String str="MADAM";
        System.out.println(checkPalindromeUsingRecursion(str,0, str.length()));
    }
    public static boolean checkPalindromeUsingRecursion (String str, int start, int end) {
        if (start >= end)
        {
            return  true;
        }
        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        return  checkPalindromeUsingRecursion(str,start+1,end-1);

    }
}
