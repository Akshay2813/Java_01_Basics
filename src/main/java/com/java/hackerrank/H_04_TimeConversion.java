package com.java.hackerrank;

import java.util.Arrays;

public class H_04_TimeConversion {

    public static void main (String[] args)
    {
        String str = "12:40:22AM";  //00:40:22
        System.out.println(timeConversion(str));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String ans="";
        String[] arr = s.split(":");

        if(s.contains("PM"))
        {
            if(Integer.parseInt(arr[0]) !=12)
            {
                    arr[0]= String.valueOf((Integer.parseInt(arr[0])+12));
            }
        }
        else if(s.contains("AM"))
        {
            if(Integer.parseInt(arr[0]) ==12)
            {
                arr[0]= String.valueOf((Integer.parseInt(arr[0])-12));
            }

        }
        arr[0] = String.format("%02d", Integer.parseInt(arr[0]));

        for(int i=0; i<arr.length-1;i++)
        {
            ans=ans+arr[i]+":";
        }
        ans=ans+arr[arr.length-1].substring(0,2);

//        ans=String.format("%02d:%s:%s", arr[0], arr[1], arr[2]);

System.out.println(Arrays.toString(arr));

        return ans;

    }
}
