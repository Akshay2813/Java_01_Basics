package com.java.gfg;

public class gfg_03_reverseString {

    public static void main(String[] args) {
        System.out.println(reveresString("AaBBccccD"));
    }

    public static String reveresString(String str) {

        String temp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            temp=temp+str.charAt(i);
        }
        return temp;
    }
}
