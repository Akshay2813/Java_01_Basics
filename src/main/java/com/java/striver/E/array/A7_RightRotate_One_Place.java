package com.java.striver.E.array;

import java.util.Arrays;

public class A7_RightRotate_One_Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        RightRotateArrByOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void RightRotateArrByOnePlace(int[] arr) {
        //1 2 3 4 5
        //5 1 2 3 4
        int temp = arr[arr.length-1];//5
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i -1];
        }
        arr[0] = temp;
    }
}
