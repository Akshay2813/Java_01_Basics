package com.java.basics.revision;

public class R2 {

    public int instanceVar;
    public static int staticVar;

    public static void main(String[] args)
    {
        R2 r2 = new R2();
        System.out.println(r2.instanceVar);  //need object to use this
        System.out.println(staticVar);

        int localVar = 0;
        System.out.println(localVar);  //need to initliaze as JVM not provide default value




    }
}
