package com.java.striver.F_binarysearch;

public class B6_Floor {

    public static void main(String[] args)
    {
        int[] nums ={3, 4, 4, 7, 8, 10};
        int x= 5;
        System.out.println(getFloor(nums,x));  //3.7 >> floor value 3 ceil value 4
/*
        The floor of x is the largest element in the array which is smaller than or equal to x.
        The ceiling of x is the smallest element in the array greater than or equal to x.
        If no floor or ceil exists, output -1.

 */



    }

    public static int getFloor(int[] arr, int x) {
            int start=0;
            int end=arr.length-1;
            int ans=-1;
            int mid = start + (end-start)/2;
            while(start<=end)
            {
                if(arr[mid]<=x)
                {
                    ans=arr[mid];
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
                mid = start + (end-start)/2;
            }
            return ans;
    }
}
