package com.java.gfg;

public class gfg_04_swapNumber {

    public static void main(String[] args) {
        swap(3, 5);
    }

    public static void swap(int a, int b) {
        // code here
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
