package com.java.striver.E.array;

public class A13_MaximumConsecutiveOnes {
//    Given a binary array nums, return the maximum number of consecutive 1's in the array.
//nums = [1,1,0,1,1,1]  answer is 3

    public static void main(String[] args)
    {
//        int[] arr = {1,1,0,1,1,1};
           int [] arr ={1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] arr)
    {
        int count=0;
        int max=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==1 )
            {
                count++;
                if(count>=max)
                {
                    max=count;
                }
            }
            else
            {
                count=0;
            }
        }
        return max;
    }

}
