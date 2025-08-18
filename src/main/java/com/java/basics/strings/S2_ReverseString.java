package com.java.basics.strings;

public class S2_ReverseString {

//    Example: "I love Java" → "Java love I" (or reverse each word individually)

    public static void main(String[] args) {
        String str = "I love Java";
        System.out.println(reverseStrWords(str));
        System.out.println(reverseStrWords_Optimal(str));


    }

    public static String reverseStrWords(String str) {
        String[] arr = str.split(" ");
        String ans="";
        for (int i = 0; i < arr.length; i++) {
            ans= arr[i] + " " + ans;
        }
        return ans;
    }

    public static String reverseStrWords_Optimal(String str) {
        String[] arr = str.trim().split(" "); // handles multiple spaces
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" "); // add space only between words
            }
        }
        return sb.toString();
    }

}
