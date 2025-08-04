package com.java.striver.B.basicrecursion;

public class R8_FibonacciNumber {

//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...


    public static void main(String[] args) {
        System.out.println(FindNThFibonacciNum(4));
    }

    public static int FindNThFibonacciNum(int n) {
        if (n <= 1) {
            return n;
        }
        int last =FindNThFibonacciNum(n-1);
        int secondLast =FindNThFibonacciNum(n - 2);
        return  last+secondLast;
    }

}
