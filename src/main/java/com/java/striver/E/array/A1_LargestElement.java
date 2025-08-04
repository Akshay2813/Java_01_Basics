package com.java.striver.E.array;

public class A1_LargestElement {
    public static void main(String[] args)
    {
        int[] arr = {5,7,8,9,11,1,0,2};
       System.out.println(largestElementInArr(arr));
    }
    public static int largestElementInArr(int[] arr)
    {
        int largestElement = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>largestElement)
            {
                largestElement=arr[i];
            }
        }
        return largestElement;
    }
}
