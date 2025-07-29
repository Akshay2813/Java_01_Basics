package com.java.gfg.array;

import java.util.*;

public class GFG_03_LeaderInArr {

//    You are given an array arr of positive integers. Your task is to find all the leaders in the array.
//    An element is considered a leader if it is greater than
//    or equal to all elements to its right.
//    The rightmost element is always a leader.
//     [16 17 4 3 5 2]


    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leadersBruteForce(arr));
        System.out.println(leadersOptimized(arr));
    }

    public static ArrayList<Integer> leadersBruteForce(int[] arr) {
        // code here
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLead = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLead = false;
                    break;
                }
            }
            if (isLead) {
                resultList.add(arr[i]);
            }
        }

        return resultList;

    }


    public static ArrayList<Integer> leadersOptimized(int[] arr) {
        // code he
        int maxLeadElementFromRight = arr[arr.length - 1];
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(maxLeadElementFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxLeadElementFromRight) {
                maxLeadElementFromRight = arr[i];
                resultList.add(maxLeadElementFromRight);
            }

        }
        Collections.reverse(resultList);

        return resultList;
    }
}