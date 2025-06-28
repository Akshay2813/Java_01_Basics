package com.java.basics.array.search;

import java.util.Arrays;

public class S_05_SqaureRoot {

    public static void main(String[] args) {
        int num=625;
        System.out.println("Square root of " + num +" = " +findSquareRootOf(num));

    }

    public static int findSquareRootOf(int num) {
        int start=0;
        int end=num;
        int mid=start + (end-start)/2;
        int ans = 0;

        while(start<=end)
        {
            if(mid*mid == num)
            {
                return mid;
            }
             if( mid*mid > num)
            {
                end=mid-1;
            }
            else {
                ans=mid;
                start=mid+1;
            }
            mid=start + (end-start)/2;

        }
        return ans;
    }
}

