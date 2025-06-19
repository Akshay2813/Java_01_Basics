package com.java.program;

public class Pattern_3 {

    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of rows = ");
//        int n = scanner.nextInt();


//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
