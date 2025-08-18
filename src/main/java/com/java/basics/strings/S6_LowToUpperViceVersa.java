package com.java.basics.strings;

public class S6_LowToUpperViceVersa {

    public static void main(String[] args) {
        String str = "aaBBZz";
        System.out.println(covertLowerTOUpperAndUpperToLower(str));

    }

    public static String covertLowerTOUpperAndUpperToLower(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                ans = ans + Character.toLowerCase(str.charAt(i));
            }
            if (Character.isLowerCase(str.charAt(i))) {
                ans = ans + Character.toUpperCase(str.charAt(i));
            }

        }
        return ans;
    }
}
