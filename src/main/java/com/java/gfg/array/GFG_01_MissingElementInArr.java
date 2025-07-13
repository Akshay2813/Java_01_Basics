package com.java.gfg.array;

public class GFG_01_MissingElementInArr {

//    You are given an array arr[] of size n - 1 that contains distinct
//    integers in the range from 1 to n (inclusive).
//    This array represents a permutation of the integers from 1 to n with one element missing.
//    Your task is to identify and return the missing element.
//     [1, 2, 3, 5]
    public  static  int missingNum(int arr[])
    {
        int sum=0;
        for(int i=1;i<=arr.length;i++)
        {
            sum=sum+i;
        }

        int arrSum=0;
        for(int i=0; i<arr.length;i++)
        {
            arrSum=arrSum+arr[i];
        }
        return sum-arrSum;

    }
}
