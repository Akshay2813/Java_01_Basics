package com.java.hackerrank;

import java.util.Arrays;
import java.util.List;
public class H03_RatiosOfPos_Neg_Zero {

    public static void  main(String[] args)
    {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0; i<arr.size();i++)
        {
            if(arr.get(i)>0)
            {
                pos++;
            }
            else if(arr.get(i)<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
        System.out.printf("%.6f%n", (double) pos / arr.size());
        System.out.printf("%.6f%n", (double) neg / arr.size());
        System.out.printf("%.6f%n", (double) zero / arr.size());

    }
}
