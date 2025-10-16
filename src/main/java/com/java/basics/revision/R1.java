package com.java.basics.revision;

import java.util.Arrays;

public class R1 {

    public static void main(String[] args) {
        byte b = 2;  //1 byte
        short s = 23; //2 byte
        int i1 = 50; //4 byte
        long l = 50l; //8 byte

        System.out.println(l);

        float f = 0.5f;  //4 byte
        double d = 0.5;  // 8 byte

        boolean b1 = true; //depened on VM
        char ch = 'a'; //2 byte A-Z a-z 1 * etc +all lanuguages

        int[] arr = new int[3];
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        int[][] twoDArr = new int[3][2];
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


