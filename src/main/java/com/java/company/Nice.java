package com.java.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Nice {


    /* 0,1,0,1,0,1,0,1] with all 0s on the left side
     */
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,1,0,1,0,1, 'c','d'};
       int [] ans=  checkProgramNonZeroOne(arr);
        moveZero(ans);
        System.out.println(Arrays.toString(ans));
    }
//    relational (Oracle, MSSQL, MySQL, PostgreSQL) and NoSQL (Cassandra) databases
//
//    Linux (basics), Docker, Kubernetes

    public  static int[] checkProgramNonZeroOne(int[] arr)
    {
        int[] ans = new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] !=0 && arr[i] != 1)
            {
                ans[j]=arr[i];
                j++;
            }
        }
        return ans;
    }
    public void getFileNum(String filePath) throws FileNotFoundException {

//        FileInputStream

    }
    public  static void moveZero(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            if(arr[start]==0)
            {
                start++;
            }
            else if(arr[start]==1)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
            }
            else
            {
                start++;
                end--;
            }
        }
    }
}
