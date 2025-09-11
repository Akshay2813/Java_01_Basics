package com.java.striver.E.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A19_LongestConsecutiveSequence {


    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive_bruteForce(nums));
        System.out.println(longestConsecutive_better(nums));
        System.out.println(longestConsecutive_optimal(nums));

//        System.out.println(Arrays.toString(nums));
    }

    public static boolean linearSerach(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutive_bruteForce(int[] arr) {
//[100, 4, 200, 1, 3, 2]

        if (arr.length == 0) {
            return 0;
        }
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i]; //100
            int count = 1;
            while (linearSerach(arr, x + 1) == true) {
                x = x + 1;
                count++;
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;

    }


    public static int longestConsecutive_better(int[] arr) {

        ////[100, 4, 200, 1, 3, 2]
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr); //1 2 3 4 100 200
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int countCurrent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                countCurrent = countCurrent + 1;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                lastSmaller = arr[i];
                countCurrent = 1;
            }

            if (countCurrent > longest) {
                longest = countCurrent;
            }

        }
        return longest;
    }

    public static int longestConsecutive_optimal(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        Set<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            tempSet.add(arr[i]);
        }

        int longest=1;
        for (int it : tempSet) {
            if (!tempSet.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (tempSet.contains(x+1))
                {
                    x=x+1;
                    count++;
                }
                if(count>longest)
                {
                    longest=count;
                }
            }
        }

        return longest;
    }
}

