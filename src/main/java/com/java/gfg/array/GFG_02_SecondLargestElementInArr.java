package com.java.gfg.array;

public class GFG_02_SecondLargestElementInArr {

    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;

    }
}
