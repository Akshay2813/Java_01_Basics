package com.java.striver.E.array;

public class A12_MissingNumberInArr {

//   268 >> Given an array nums containing n distinct numbers in the range [0, n],
//   return the only number in the range that is missing from the array.

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumInArr_BruteForce(arr));
        System.out.println(missingNumInArr_Better(arr));
        System.out.println(missingNumInArr_Optimal_I(arr));
        System.out.println(missingNumInArr_Optimal_II(arr));

    }

    public static int missingNumInArr_BruteForce(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {  //0 to 3 >>0 1 2 3
            int flag = 0;
            for (int j = 0; j < arr.length; j++) { //0 to 2 >> 0 1 2
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;

    }


    public static int missingNumInArr_Better(int[] arr) {
        int[] hashArr = new int[arr.length + 1];  //4 >> 0 0 0 0
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] = 1;
        }
        for (int i = 0; i < hashArr.length; i++) {
            if (hashArr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumInArr_Optimal_I(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i <= arr.length; i++) {
            totalSum = totalSum + i;
        }
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        return totalSum - arrSum;
    }

    public static int missingNumInArr_Optimal_II(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i <= arr.length; i++) {
            xor1 = xor1 ^ i;
        }
        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }
        return xor1 ^ xor2;

    }
}
