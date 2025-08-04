package com.java.striver.E.array;

public class A2_Second_LargestElement {
    public static void main(String[] args)
    {
        int[] arr = {5,7,8,9,10,11,1,0,2};
       System.out.println(secondLargestElementInArr(arr));
    }
    public static int secondLargestElementInArr(int[] arr)
    {
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++)
        {
          if(arr[i]>largestElement)
          {
              secondLargest=largestElement;
              largestElement=arr[i];
          }
          else if(arr[i]>secondLargest && arr[i]<largestElement)
          {
              secondLargest=arr[i];
          }
        }
        return secondLargest;
    }
}
