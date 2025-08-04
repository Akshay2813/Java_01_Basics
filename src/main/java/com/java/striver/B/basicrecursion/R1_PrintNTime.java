package com.java.striver.B.basicrecursion;

public class R1_PrintNTime {


    public static void main(String[] args)
    {
        printNTimeUsingRecursion("AKshay",5);

    }

    public static void printNTimeUsingRecursion(String str,int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(str);
        printNTimeUsingRecursion(str,n-1);
    }
}
