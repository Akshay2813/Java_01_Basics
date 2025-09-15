package com.java.striver.F_binarysearch;

public class B9_SearchInSorted {

    //    33. Search in Rotated Sorted Array >>Unique element present
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        int target =0;
        System.out.println(search(arr,target));
    }

    public static int search(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start<=end)
        {
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[start]<=arr[mid]) //then left sorted
            {
                if(arr[start]<=target && target <=arr[mid])
                {
                    end = mid-1;
                }

                else
                {
                    start= mid+1;
                }
            }
            else//then right sorted
            {
                if(arr[mid] <= target && target<=arr[end] )
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
}