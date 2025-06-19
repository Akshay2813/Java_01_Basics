package com.java.program;

import java.util.Scanner;

public class Pattern_1_b {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows = ");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++)
        {
            System.out.println("*");
        }
    }
}
