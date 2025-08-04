package com.java.striver.A.basicmath;

public class S4_ArmstrongNumbers {

    public  static  void main (String[] args)
    {
        System.out.println(isArmstrongNum(371));
        System.out.println(isArmstrongNum(101));


    }
    public static boolean isArmstrongNum(int n)
    {
        int temp= n;
        int num = 0;
        while (n>0)
        {
            int remainder = n%10;
            num = num +remainder*remainder*remainder;
            n=n/10;
        }
        if(temp==num)
        {
            return true;
        }
        return false;
    }
}
