package com.java.striver.F_binarysearch;

public class B5_Search_Insert_Position {

    public static void main (String[] args)
    {
        int [] arr = { 5,7,7,8,8,10};
        int target = 9;
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        int mid = start + (end-start)/2;
        int ans=nums.length;
        while(start<=end)
        {
            if(nums[mid]>=target)
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
