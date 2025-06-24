package com.java.basics.array;

import java.util.Arrays;

public class Arr_01_Basics {
    public static void main(String[] args) {
        //Declaration
        int[] arr_1;
        int arr_2[];
        int[] arr_3;

        //Creation
        int[] arr_4 = new int[5];
        System.out.println("Length of arr_4 is = " + arr_4.length);

        int[] arr_5 = new int['a'];
        System.out.println("Length of arr_5 is = " + arr_5.length);

        //Initialization
        int[] arr_6 = {10, 20, 30, 40, 50};
        System.out.println("arr_6 = " + Arrays.toString(arr_6));
        //OR
        int[] arr_7 = new int[5];
        arr_7[0] = 100;
        arr_7[1] = 200;
        arr_7[2] = 300;
        arr_7[3] = 400;
        arr_7[4] = 500;

        System.out.println("arr_7 = " + Arrays.toString(arr_7));


    }
}
