package com.java.striver.B.basicrecursion;

public class R5_FactorialOfN {

    public static  void main(String[] args)
    {
        System.out.println(  factorialOfN(5));
    }

    public static int factorialOfN(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * factorialOfN(n-1);
    }
}
