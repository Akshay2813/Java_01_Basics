package com.java.striver.A.basicmath;
//You are given an integer n. You need to return the number of digits in the number.
//
//The number will have no leading zeroes, except when the number is 0 itself.
public class S1_Count_Digit {

    public static void main(String[] args)
    {
        System.out.println(countDigit(120));
    }
    public static int countDigit(int n) {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10 ;
        }
        return count;
    }
}

