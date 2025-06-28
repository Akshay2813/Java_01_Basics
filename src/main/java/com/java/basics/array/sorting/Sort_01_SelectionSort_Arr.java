package com.java.basics.array.sorting;

import java.util.Arrays;

public class Sort_01_SelectionSort_Arr {

    public static void main(String[] args)
    {
        int[] arr = {500,400,300,200,100};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }

            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
    }
}
