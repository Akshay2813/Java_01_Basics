package com.java.striver.E.array;

public class A16_SubArrSum {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSumOfSubArr_BruteForce(arr));
//        System.out.println(maxSumOfSubArr_Better(arr));
//        System.out.println(maxSumOfSubArr_Optimal(arr));
        printaxSumOfSubArr_Optimal(arr);
    }

    public static int maxSumOfSubArr_BruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSumOfSubArr_Better(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }


    public static int maxSumOfSubArr_Optimal(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum>maxSum)
            {
                maxSum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }

    public static int printaxSumOfSubArr_Optimal(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int startIndex =-1;
        int endIndex= -1;
        int start=-1;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==0)
            {
               start=i;
            }
            if(sum>maxSum)
            {
                maxSum=sum;
                startIndex=start;
                endIndex=i;

            }
            if(sum<0)
            {
                sum=0;

            }
        }

        for(int i=startIndex; i<=endIndex;i++)
        {
            System.out.print(arr[i] + " ");
        }
        return maxSum;
    }
}
