package com.java.striver.E.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A20_RotateMatrixBy90Degree {

    public static void main(String[] args)
    {
        List<List<Integer>> li = new ArrayList<>();

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList(7, 8, 9);

        li.add(l1);
        li.add(l2);
        li.add(l3);

        printList(li);

        System.out.println();

        rotateListBy90Degree(li);
    }

    public static void printList(List<List<Integer>> li)
    {
        for(int i=0; i<li.size();i++)
        {
            for(int j=0; j<li.get(i).size();j++)
            {
                System.out.print(li.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }

    public static void rotateListBy90Degree(List<List<Integer>> li)
    {
        for(int i=0; i<li.size();i++)
        {
            for(int j=0; j<li.get(i).size();j++)
            {
                System.out.print(li.get(li.size()-j-1).get(i) +" ");
            }
            System.out.println();
        }
    }



}