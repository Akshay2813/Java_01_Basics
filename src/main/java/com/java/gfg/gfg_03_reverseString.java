package com.java.gfg;

public class gfg_03_reverseString {

    public static void main(String[] args) {
        System.out.println(reveresString_way_II("AaBBccccDE"));
    }

    public static String reveresString_way_I(String str) {

        String temp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            temp=temp+str.charAt(i);
        }
        return temp;
    }

    public static String reveresString_way_II(String str) {

        String temp="";
        for(int i=0;i<str.length();i++)
        {
          temp=str.charAt(i) + temp;
        }
        return temp;
    }
}
