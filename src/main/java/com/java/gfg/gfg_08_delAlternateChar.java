package com.java.gfg;

public class gfg_08_delAlternateChar {
    public String delAlternate(String S) {
        // code here

        String temp="";
        for (int i=0; i<S.length();i=i+2)
        {
            temp=temp+S.charAt(i);
        }
        return temp;
    }
}
