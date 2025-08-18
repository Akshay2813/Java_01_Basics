package com.java.striver.E.array;

import java.util.Arrays;

public class A6_LeftRotoateBy_K_Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
//        leftRotateArrByKPlace_BruteForce(arr, 2);
        leftRotateArrByKPlace_Optimal(arr,12);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotateArrByKPlace_BruteForce(int[] arr, int k) {

        //1 2 3 4 5  k=2
        k = k % arr.length;
        int[] tempArr = new int[k];
        for (int i = 0; i < k; i++) {
            tempArr[i] = arr[i];      // 1 2
        }
//       System.out.println("temparr " + Arrays.toString(tempArr));
        for (int i = 0; i < arr.length - k; i++) {  // 0 3
            arr[i] = arr[i + k];  //  3 4 5 4 5
        }
//        System.out.println("Arr " + Arrays.toString(arr));
        for (int i = 0; i < tempArr.length; i++) {
            arr[arr.length - k + i] = tempArr[i];  // 3 4 5 1 2
        }

    }


    public static void leftRotateArrByKPlace_Optimal(int[] arr, int k) {

        //1 2 3 4 5 6 7
        // 2 1  // 7 6 5 4 3>> reverse (0,d-1) revser(d,n-1)
        // 4 5 6 7 1 2
        k=k%arr.length;
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,arr.length-1);
        reverseArr(arr, 0, arr.length-1);

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
