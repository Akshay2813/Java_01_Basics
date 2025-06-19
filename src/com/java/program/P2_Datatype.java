package com.java.program;

public class P2_Datatype {

    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483647999999999l; //random value

        float f = 2.03f;
        double d = 3.0990;

        char ch = 'a';


        //Type conversion
//        byte>short>int>long>float>double
//        char>int>long>float>double

        //smaller Datatype to higher datatype
        byte b1 = 127;
        int i1 = b1;

        //Higher Datatype to small datatype need type casting
        int i2=127;
        byte b2= (byte) i2;


    }
}
