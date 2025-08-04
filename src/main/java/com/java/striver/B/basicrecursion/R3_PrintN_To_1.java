package com.java.striver.B.basicrecursion;

public class R3_PrintN_To_1 {

    public static void main(String[] args)
    {
        printN_To_1_UsingRecursion(5);
    }

    public static void printN_To_1_UsingRecursion(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printN_To_1_UsingRecursion(n-1);
    }
}
