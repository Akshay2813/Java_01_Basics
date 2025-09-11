package com.java.striver.F_binarysearch;

public class B2_BinarySearch_UsingRecursion {

    public static void main(String[] args) {
        //for Binary Search Arr should sorted arr
        int[] arr = {10, 20, 30, 40, 50};
        int target = 10;
      System.out.print("Target of at Index= "+ binarySearch_UsingRecursion(arr, 0,arr.length-1,target));
        System.out.print("Target of at Index= "+ binarySearch_UsingRecursion(arr, 0,arr.length-1,100));

    }

    public static int binarySearch_UsingRecursion(int[] arr, int start, int end, int target) {

       if(start>end)
       {
           return -1;
       }
       int mid= start+ + (end - start)/2;

       if(arr[mid]==target)
       {
           return mid;
       }
       else if(arr[mid]<target)
       {
           return binarySearch_UsingRecursion(arr,mid+1,end,target);
       }
       else
       {
           return binarySearch_UsingRecursion(arr,start,mid-1,target);
       }
    }
}
