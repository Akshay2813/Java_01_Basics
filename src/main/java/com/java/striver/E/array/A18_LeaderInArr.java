package com.java.striver.E.array;

import java.util.ArrayList;
import java.util.Collections;

public class A18_LeaderInArr {


    public static void main(String[] args)
    {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders(nums));
    }

    public static ArrayList<Integer> leaders(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();
//        Input: nums = [1, 2, 5, 3, 1, 2]


        int lead = nums[nums.length - 1]; //2
        result.add(lead);
        for (int i = nums.length - 2; i >= 0; i--) {

            if(nums[i]>=lead)
            {
                lead=nums[i];
                result.add(nums[i]); //3
            }


        }

        Collections.reverse(result);

        return  result;

    }
}
