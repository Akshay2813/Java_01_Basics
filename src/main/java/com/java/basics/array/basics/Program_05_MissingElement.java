package com.java.basics.array.basics;

public class Program_05_MissingElement {
//    You are given an array arr[] of size n - 1 that contains distinct integers in
//    the range from 1 to n (inclusive). This array represents a permutation of the integers
//        from 1 to n with one element missing. Your task is to identify and return the missing element.
    public static void main(String[] args) {
        System.out.println( missingElement(new int[] {1, 2, 3, 5}));

    }


    public static int missingElement(int[] arr) {
        int sum=0;
        int arrSum=0;
//        Input: arr[] = [1, 2, 3, 5]

        for(int i=1;i<=arr.length+1;i++)
        {
            sum=sum+i; //1+2+3+4+5
        }
        for(int i=0; i<arr.length;i++)
        {
            arrSum = arrSum+arr[i]; //11
        }

        return sum-arrSum;



    }
}