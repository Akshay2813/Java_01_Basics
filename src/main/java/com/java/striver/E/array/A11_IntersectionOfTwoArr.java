package com.java.striver.E.array;

import java.util.Arrays;

public class A11_IntersectionOfTwoArr {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 2, 3, 4, 7, 7, 7, 8};
        interSectionTwoArrBruteForce(arr1, arr2);
        interSectionTwoArr_Optimal(arr1,arr2);
    }
    public static void interSectionTwoArrBruteForce(int[] arr1, int[] arr2)
    {
        int[] resuultArr = new int[arr1.length+arr2.length];
        int[] visitedArr = new int[arr2.length];
        int k=0;
        int m=0;
        for(int i=0; i<arr1.length;i++)
        {
           for(int j=0; j<arr2.length;j++)
           {
               if(arr1[i]==arr2[j] && visitedArr[j] == 0 )
               {
                   resuultArr[m]=arr1[i];
                   visitedArr[j]=1;
                   m++;
               }
               else if (arr2[j]>arr1[i])
               {
                   break;
               }
           }
        }

        System.out.println(Arrays.toString(resuultArr));
    }

    public static void interSectionTwoArr_Optimal(int[] arr1, int[] arr2)
    {
        int i=0;
        int j=0;
        int[] resultArr = new int[arr1.length + arr2.length];
        int m=0;
        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                j++;
            }
            else
            {
                resultArr[m]= arr1[i];
                m++;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
