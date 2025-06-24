package com.java.program.basicprogram;

public class Pattern_5 {

    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of rows = ");
//        int n = scanner.nextInt();
//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *
        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int space=0;space<n-i-1;space++)
            {
                System.out.print(" ");
            }
            for (int star=0;star<i+1;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
