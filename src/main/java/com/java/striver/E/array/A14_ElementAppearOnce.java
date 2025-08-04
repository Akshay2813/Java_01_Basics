package com.java.striver.E.array;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: nums = [4,1,2,1,2]  >> ans is 4
public class A14_ElementAppearOnce {

    public static  void main(String[] args)
    {
        int[] arr = {4,1,2,1,2};
        System.out.println(findElementAppearOnceInArrBruteForce(arr));
        System.out.println(findElementAppearOnceInArrBetter(arr));
        System.out.println(findElementAppearOnceInArrOptimal(arr));

    }
    public static int findElementAppearOnceInArrBruteForce(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            int temp=arr[i];
            int count = 0;
            for(int j=0; j<arr.length;j++)
            {
                if(arr[j]==temp)
                {
                    count++;
                }
            }
            if(count==1)
            {
                return temp;
            }
        }
        return -1;
    }

    public static int findElementAppearOnceInArrBetter(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        int[] hashArr = new int[max+1];
        for(int i=0; i<arr.length;i++)
        {
            hashArr[arr[i]] = hashArr[arr[i]] +1;
        }
        for(int i=0; i<arr.length;i++)
        {
            if(hashArr[i]==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static int findElementAppearOnceInArrOptimal(int[] arr)
    {
        int num = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            num=num^arr[i];
        }
        return num;
    }
}
