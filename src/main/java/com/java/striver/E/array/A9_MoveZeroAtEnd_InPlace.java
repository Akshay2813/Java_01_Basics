package com.java.striver.E.array;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining
//the relative order
//of the non-zero elements.
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class A9_MoveZeroAtEnd_InPlace {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(arr));
        moveZeroes_BruteForce_withInPlace(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static void moveZeroes_BruteForce_withoutInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == 0) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                end--;
            }
            start++;
        }
    }

    public static void moveZeroes_BruteForce_withInPlace(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        int[] tempArr = new int[count];
        int m=0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] != 0)
          {
              tempArr[m]=arr[i];
              m++;
          }
        }

        for(int i=0; i<tempArr.length;i++)
        {
            arr[i]=tempArr[i];
        }
        for(int i=tempArr.length;i<arr.length;i++)
        {
            arr[i]=0;
        }
    }

    public void moveZeroesOptimal(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }
}
