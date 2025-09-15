package com.java.striver.F_binarysearch;

public class B10_SearchInSorted_Part_II {

//    81. Search in Rotated Sorted Array II  >>Duplicate element present
    public static void main(String[] args)
    {
        int[] arr ={2,5,6,0,0,1,2};
        int target =0;
        System.out.println(search(arr,target));
    }

    public static boolean search(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] == target) {
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high])
            {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                //then it  left sorted means arr is sorted left half
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //then this right sorted means arr is sorted right half
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            mid = low + (high - low) / 2;

        }
        return false;


    }
}
