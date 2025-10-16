package com.java.company;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStr {
    public static void main(String[] args)
    {

    }

    public static void removeDuplicate(String str)
    {
        Set<String> st = new HashSet<>();

        for(int i=0; i<str.length();i++)
        {
            st.add(String.valueOf(str.charAt(i)));
        }
        System.out.println(st);
    }
}
  