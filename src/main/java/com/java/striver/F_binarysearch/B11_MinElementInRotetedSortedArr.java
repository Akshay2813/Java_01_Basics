package com.java.striver.F_binarysearch;

public class B11_MinElementInRotetedSortedArr {

//    153. Find Minimum in Rotated Sorted Array
    public static void  main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }

    public static  int findMin(int[] arr) {

        int mini= Integer.MAX_VALUE;

        int low=0;
        int high=arr.length-1;
        int mid= low + (high-low)/2;
        while (low<=high)
        {
            if(arr[low]<=arr[mid])
            {
                //left half is sorted and arr[low] is smallest
                if(arr[low]<=mini)
                {
                    mini=arr[low];
                }
                low=mid+1;
            }
            else
            {
                //right half is sorted and arr[mid] smallest
                if(arr[mid]<mini)
                {
                    mini=arr[mid];
                }
                high=mid+1;
            }
            mid= low + (high-low)/2;
        }
        return mini;
    }
}
