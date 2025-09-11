package com.java.company;

public class Practice {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        printAllSubArr_BruteForce(arr);
        printAllSubArr_Better_NotPrintAllSubarr(arr);

    }
    public static void printAllSubArr_BruteForce(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                for(int k=i; k<=j;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }

    public static void printAllSubArr_Better_NotPrintAllSubarr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {

                    System.out.print(arr[j] + " ");

            }
            System.out.println();


        }
    }
}
