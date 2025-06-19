package com.java.program;

public class Program_01_ReverseInteger {

    public static void main(String[] args)
    {
       System.out.println( reverseInt(123));
//       System.out.println( reverseInt(1000));

    }


    public static int reverseInt(int n)
    {
        int result=0;
        while(n != 0)
        {
           int remainder= n%10;
           result=result*10+remainder;
           n=n/10;
        }
        return result;
    }
}
