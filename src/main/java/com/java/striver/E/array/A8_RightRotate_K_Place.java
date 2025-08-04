package com.java.striver.E.array;

import java.util.Arrays;

public class A8_RightRotate_K_Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
//        RightRotateArrByKPlace_BruteForce(arr,2);
        RightRotateArrByKPlace_Optimal(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void RightRotateArrByKPlace_BruteForce(int[] arr, int k) {
        //1 2 3 4 5
        //4 5 1 2 3
        k=k%arr.length;
        int[] tempArr= new int[k];
        for(int i=0;i<k;i++)
        {
            tempArr[i]=arr[arr.length-k+i];
        }
        for(int i=arr.length-1;i>=k;i--)
        {
            arr[i]=arr[i-k];
        }
        for(int i=0;i<k;i++)
        {
            arr[i]=tempArr[i];
        }
    }

    public static void RightRotateArrByKPlace_Optimal(int[] arr, int k) {

        k=k%arr.length;

        reverseArr(arr,0, arr.length-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,arr.length-1);
    }
    public static void reverseArr(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
