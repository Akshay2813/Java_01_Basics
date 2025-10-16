package com.java.striver.G.String;

import java.util.Arrays;

public class S2_ReverseWordsInString {

    public static void main(String[] args)
    {
        String str = "  Hellow World";
        System.out.println(reverseWords(str));
    }

    public static  String reverseWords(String str) {

        String[] arr = str.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=arr.length-1;i>=0; i--)
        {
            if(arr[i].length()==0)
            {
                continue;
            }
             if(ans.length()==0)
            {
                ans.append(arr[i]);
            }
            else
            {
//                ans=ans+" "+arr[i];
                ans.append(" ");
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }

    public static void reverseArr(String[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            String temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
}
