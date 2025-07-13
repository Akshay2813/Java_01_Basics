package com.java.gfg;

import java.util.HashMap;
import java.util.Map;

public class gfg_09_anagramString {

    static int areAnagram(String S1, String S2) {
        // code here

       if(S1.length() != S2.length())
       {
           return 0;
       }

       Map<Character, Integer> m1 = new HashMap<>();
       Map<Character, Integer> m2 = new HashMap<>();

       for(int i=0; i<S1.length();i++)
       {
           int count = m1.getOrDefault(S1.charAt(i),0);
           m1.put(S1.charAt(i), count+1);
       }


       for(int j=0 ;j<S2.length();j++)
       {
           int count = m2.getOrDefault(S2.charAt(j),0);
           m2.put(S2.charAt(j),count+1);
       }

       if(m1.equals(m2))
       {
           return 1;
       }
       else {
           return 0;
       }




    }
}
