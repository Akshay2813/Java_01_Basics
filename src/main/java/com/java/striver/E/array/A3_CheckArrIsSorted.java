package com.java.striver.E.array;

public class A3_CheckArrIsSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(checkIfArrIsSorted(arr));

        int[] arr1 = {1, 2, 3, 4, 2, 6, 7};
        System.out.println(checkIfArrIsSorted(arr1));
    }

    public static boolean checkIfArrIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
