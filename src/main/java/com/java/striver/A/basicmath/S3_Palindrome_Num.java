package com.java.striver.A.basicmath;

public class S3_Palindrome_Num {

    public static void main(String[] args) {
        System.out.println(isNumPalindrome(1001));
        System.out.println(isNumPalindrome(100));

    }

    public static boolean isNumPalindrome(int n) {
        int temp = n;
        int num = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            num = num * 10 + remainder;
            temp = temp / 10;
        }
        if (num == n) {
            return true;
        }
        return false;
    }
}
