package com.java.company;

public class Test {

    //Barclay-20 Aug
    public static void main(String[] args) {
        int n = 7;
        printFib(n);
        System.out.println();
        printFib_II(n);

    }

    public static void printFib(int n)
    {
        for (int i=0; i<n; i++)
        {
         System.out.print(m1(i) + " ");
        }
    }
    public static  int m1(int n)  //2
    {

        if (n == 0 || n == 1) {
            return 1;
        }
        return m1(n - 2) + m1(n - 1);

    }

    public static void printFib_II(int n) {
        if (n <= 0) return; // no numbers to print

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

}

//https://cosmocode.io/automation-practice-webtable/
//write xpath using following-sibling  //table[@id='countries']/tbody/tr[4]/preceding-sibling::tr[1]
//what are annotation for cucumber
