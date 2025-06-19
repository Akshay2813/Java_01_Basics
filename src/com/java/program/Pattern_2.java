package com.java.program;

import java.util.Scanner;

public class Pattern_2 {

    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of rows = ");
//        int n = scanner.nextInt();
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
