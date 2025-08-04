package com.java.striver.B.basicrecursion;

public class R2_Print1_To_N {

    public static void main(String[] args)
    {
        print1_To_N_UsingRecursion( 5);
    }

    public static void print1_To_N_UsingRecursion(int n)
    {
        if(n==0)
        {
            return;
        }
        print1_To_N_UsingRecursion(n-1);
        System.out.println(n);
    }
}
