package com.java.basics;
import java.util.List;

public class P4_SwitchCase_A {
    /*
   Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator.
If operator equals to 1 add a and b, then print the result as a string.
If operator equals to 2 subtract b from a, then print the result as a string.
If operator equals to 3 multiply a and b, then print the result as a string.
If operator equals to any another number, print "Invalid Input"(without quotes).
Note: Do not add a new line at the end
    */
    public static void utility(int a, int b, int v) {

        // write your code here
        switch(v)
        {
            case 1:
                System.out.print(( a + b) + "") ;
                break;
            case 2:
                System.out.print((a - b) + "");
                break;
            case 3:
                System.out.print((a * b) + "");
                break;
            default:
                System.out.print("Invalid Input");
                break;
        }

    }
}

