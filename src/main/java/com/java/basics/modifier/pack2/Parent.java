package com.java.basics.modifier.pack2;

public class Parent {

    public void m1() {
        System.out.println("Parent Class Method");
    }
}


class Child extends Parent {
    public void m1() {
        System.out.println("Child Class Method");
    }
}

class Test {
            public static void  main(String[] args)
            {
                Parent p = new Parent();
                p.m1();

                Child c = new Child();
                c.m1();

                Parent p1 = new Child();
                p1.m1();


            }
}