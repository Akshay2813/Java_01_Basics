package com.java.striver.E.array;

//169 Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
//Input: nums = [2,2,1,1,1,2,2]   >> 2


import java.util.HashMap;

public class A15_MajorityElement_NBy2_Times {
    public static void main(String[] args)
    {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityOfElements_BruteForce(arr));
        System.out.println(majorityOfElements_Better(arr));
        System.out.println(majorityOfElements_Optimal_MooreVotingAlog(arr));


    }
    public static int majorityOfElements_BruteForce(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            int temp=arr[i];
            int count=0;
            for(int j=0; j<arr.length;j++)
            {
                if(arr[j]==temp)
                {
                    count++;
                }
            }
            if(count>arr.length/2)
            {
                return temp;
            }
        }
        return -1;
    }

    public static int majorityOfElements_Better(int[] arr)
    {
        HashMap<Integer,Integer> tempMap = new HashMap<>();

        for(int i=0; i<arr.length;i++)
        {
            int count = tempMap.getOrDefault(arr[i],0);
            tempMap.put(arr[i],count+1);
        }
//        System.out.println(tempMap);
        for(int key: tempMap.keySet())
        {
            if(tempMap.get(key)> arr.length/2)
            {
                return key;
            }
        }
        return -1;
    }
    public static int majorityOfElements_Optimal_MooreVotingAlog(int[] arr) {

        int ele= arr[0];
        int count=0;
        for(int i=0 ; i<arr.length;i++)
        {
            if(count==0)
            {
                ele=arr[i];
                count=1;
            }
            else if(arr[i]==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return ele;
    }
}
