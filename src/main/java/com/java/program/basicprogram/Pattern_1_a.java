package com.java.program.basicprogram;

import java.util.Scanner;

public class Pattern_1_a {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows = ");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}
