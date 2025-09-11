package com.java.basics.array.basics;

import java.util.Arrays;
import java.util.List;

public class Program_08_ArrToList_ViceVersa {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //Arr to List
        System.out.println(Arrays.asList(arr));


        Integer[] arr1 = {1, 2, 3};
        //Arr to List
        System.out.println(Arrays.asList(arr1));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.toArray());

        Integer[] arr2 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));

    }
}
