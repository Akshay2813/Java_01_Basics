package com.java.gfg;

public class gfg_05_DeleteAlternateChar {

    public static void main(String[] args) {
        delAlternate("AaBeCfTr");
    }

    static String delAlternate(String S) {
        // code here
        String temp="";
        for (int i=0; i<S.length();i=i+2)
        {
            temp=temp+S.charAt(i);
        }
        return temp;

    }
}
