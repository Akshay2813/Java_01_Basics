package com.java.gfg;

public class gfg_01_IsVowel {

    public static void main(String[] args)
    {
        System.out.println(isVowel('E'));
    }
    public static String isVowel(char c) {
        // code here
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        }
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "YES";
        }
        return "NO";
    }
}
