package com.java.basics.modifier.pack1;

public class PublicCls_A {

    public PublicCls_A()
    {
        System.out.println("PublicCls_A constructor called");
    }

    public static void main(String[] args)
    {
        PublicCls_A A = new PublicCls_A();
        B b = new B();
    }
}

class B {
    B()
    {
        System.out.println("Default B class constructor called");

    }
}
