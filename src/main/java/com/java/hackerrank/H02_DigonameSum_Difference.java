package com.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H02_DigonameSum_Difference {

    public static void main(String[] args)
    {
        List<List<Integer>> li = new ArrayList<>();

        // First row
        li.add(Arrays.asList(1, 2, 3));
        // Second row
        li.add(Arrays.asList(4, 5, 6));
        // Third row
        li.add(Arrays.asList(9, 8, 9));

        int sum_1=0;
        int sum_2=0;
        for(int i=0 ;i<li.size();i++)
        {
            System.out.println(li.get(i));
            //00 11 22  - 02 11 20
            sum_1=sum_1+li.get(i).get(i);
            sum_2=sum_2+li.get(i).get(li.size()-i-1);
        }
        System.out.println(Math.abs(sum_1-sum_2));

    }
}
