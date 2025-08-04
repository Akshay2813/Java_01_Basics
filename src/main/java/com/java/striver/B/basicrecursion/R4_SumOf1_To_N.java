package com.java.striver.B.basicrecursion;

public class R4_SumOf1_To_N {

    public static  void main(String[] args)
    {
      System.out.println(  sumOf1ToNUsingRecursion(5));
    }

    public static int sumOf1ToNUsingRecursion(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n + sumOf1ToNUsingRecursion(n-1);
    }
}
