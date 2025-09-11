package com.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H01_CompareTriplet {



    public static  void  main(String[] args)
    {
        List<Integer> a = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> b = new ArrayList<>(Arrays.asList(3, 6, 10));
        System.out.println(compareTriplets(a,b));
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> li = new ArrayList<>(Arrays.asList(0,0));

        for (int i=0; i<a.size();i++)
        {
            if(a.get(i) > b.get(i))
            {
                li.set(0, li.get(0)+1);
            }
            else if(a.get(i) < b.get(i))
            {
                li.set(1, li.get(1)+1);
            }
        }
        return li;


    }
}


