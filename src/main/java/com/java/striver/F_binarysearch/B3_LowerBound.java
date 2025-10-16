package com.java.striver.F_binarysearch;

public class B3_LowerBound {

    public static void main(String[] args) {
        //Lower Bound arr[index] >=n
        /* Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
        The lower bound algorithm finds the first and smallest index in a sorted array where
        the value at that index is greater than or equal to a given key i.e. x.
        If no such index is found, return the size of the array.
*/
//        int[] arr = {10, 20,30,40,50,60,70,80};
//
//       int [] arr = { 1,2,2,3};
//        int target = 2;
        int [] arr = { 5,7,7,8,8,10};
        int target = 8;
        System.out.println("Target of at Index= " + binarySearch_LowerBound(arr, target));
    }

    public static int binarySearch_LowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end -start)/2;
        int ans=arr.length;

        while (start<=end)
        {

            if(arr[mid] >= target)
            {
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
}
