package com.java.basics.array;

import java.util.Arrays;

public class Arr_02_Basics {
    public static void main(String[] args) {


        int[] arr_1 = {10, 20, 30, 40, 50};
        //Print Array
        System.out.println("arr_1 = " + Arrays.toString(arr_1));

        //access element
        System.out.println("arr_1 at 0th Index = " + arr_1[0]);

        //Length of arr
        System.out.println("Length of Arr = " + arr_1.length);

        //for loope
        for(int i=0; i<arr_1.length;i++)
        {
            System.out.println("Element present at index " +i + " = " + arr_1[i] );
        }

        //for loope
        for (int i: arr_1)
        {
          System.out.println(i);
        }







    }
}
