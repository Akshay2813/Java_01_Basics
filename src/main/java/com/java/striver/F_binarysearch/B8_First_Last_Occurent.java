package com.java.striver.F_binarysearch;

import java.util.Arrays;

public class B8_First_Last_Occurent {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("Target of at Index= " + Arrays.toString(searchRange(arr, target)));
    }

    public static  int[] searchRange(int[] nums, int target) {

        int lb = startPos(nums,target);
        if(lb==nums.length || nums[lb] != target )
        {
            return new int[] {-1, -1};
        }
        return new int[] {lb, endPos(nums,target)-1};

    }

    // Lower Bound arr[index]>=target
    // The lower bound algorithm finds the first and smallest index in a sorted array

    //upper bound arr[index] > target
  // The upper bound algorithm finds the first and smallest index in a sorted array where the value
    // at that index is greater than a given key i.e. x.

    public static  int startPos(int[] arr, int target)
    {
        int ans=arr.length;
        int start=0;
        int end=arr.length-1;
        int mid= start + (end-start)/2;
        while(start<=end)
        {
            if(arr[mid]>=target)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            mid = start + (end-start)/2;
        }

        return ans;
    }

    public static int endPos(int[] arr, int target)
    {
        int ans=arr.length;
        int start=0;
        int end=arr.length-1;
        int mid= start + (end-start)/2;
        while(start<=end)
        {
            if(arr[mid]>target)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
}
