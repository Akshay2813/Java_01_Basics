package com.java.striver.A.basicmath;

public class S5_PrintAllDivisors {

    public static  void main(String[] args)
    {
//        printAllDivisorsBruteForce(36);
        printAllDivisorsOptimal(36);
    }

    public static void printAllDivisorsBruteForce(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                System.out.print(i +" , ");
            }
        }
    }

    public static void printAllDivisorsOptimal(int num)
    {
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i ==0 )
            {
                System.out.print(i +" ");
                if(num/i != i)
                {

                    System.out.print(num/i +" ");
                }
            }


        }
    }
}
