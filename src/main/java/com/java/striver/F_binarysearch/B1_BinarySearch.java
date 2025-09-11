package com.java.striver.F_binarysearch;

public class B1_BinarySearch {

    public static void main(String[] args) {
        //for Binary Search Arr should sorted arr
        int[] arr = {10, 20, 30, 40, 50};
        int target = 10;
      System.out.print("Target of at Index= "+ binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {

            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
              start=mid+1;
            }
            else {
              end=mid-1;
            }

            mid=start+ (end-start)/2;
        }
        return -1;

    }
}
