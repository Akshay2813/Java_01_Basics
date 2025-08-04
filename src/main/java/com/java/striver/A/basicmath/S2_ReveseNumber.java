package com.java.striver.A.basicmath;

public class S2_ReveseNumber {

    public static void main(String[] args)
    {
    System.out.println(reverse(-190));
    }

    public static int reverse(int x) {
        int num=0;
        boolean flag = true;
        if(x<0)
        {
            flag=false;
            x=x*(-1);
        }
        while (x>0)
        {
            int remainder = x%10;
            num = num*10 + remainder;
            x=x/10;

        }

        if(flag == false)
        {
            return num* (-1);
        }
        return num;
    }
}
