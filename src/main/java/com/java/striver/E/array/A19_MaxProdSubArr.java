package com.java.striver.E.array;

public class A19_MaxProdSubArr {

    /* Given an integer array nums, find a subarray that has the largest product,
    and return the product.
    The test cases are generated so that the answer will fit in a 32-bit integer.  */


    public static void  main(String[] args)
    {
        int[] arr = {2,3,-2,4};

        System.out.println(maxProductOfSubArr_BruteForce(arr));
        System.out.println(maxProductOfSubArr_Better(arr));
        System.out.println(maxProductOfSubArr_Optimal(arr));
    }

    public static int maxProductOfSubArr_BruteForce(int[] arr)
    {
        int maxProduct=0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int prod=1;
                for(int k=i; k<j;k++)
                {
                    prod= prod*arr[k];
                }
                if(prod>maxProduct)
                {
                    maxProduct=prod;
                }
            }
        }

        return maxProduct;
    }


    public static int maxProductOfSubArr_Better(int[] arr)
    {
        int maxProduct=0;
        for(int i=0; i<arr.length;i++)
        {
            int prod = 1;
            for(int j=i; j<arr.length; j++)
            {
               prod = prod*arr[j];
               if(prod>maxProduct)
                {
                    maxProduct=prod;
                }
            }
        }

        return maxProduct;
    }

    public static int maxProductOfSubArr_Optimal(int[] arr) {
        int prefix=1;
        int suffix=1;

        int maxProd=Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++)
        {
            if(prefix==0)
            {
                prefix=1;
            }
            if(suffix==0)
            {
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-i-1];

            if(prefix>maxProd)
            {
                maxProd=prefix;
            }
            if(suffix>maxProd)
            {
                maxProd=suffix;
            }


        }

        return maxProd;
    }

}