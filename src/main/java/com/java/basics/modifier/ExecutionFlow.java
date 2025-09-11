package com.java.basics.modifier;

public class ExecutionFlow {
    ExecutionFlow()
    {
        System.out.println("ExecutionFlow constructor called");
    }

    static {
        System.out.println("Inside Static block-1 Started");
        m1();
        System.out.println("Inside Static block-1 ended");
    }

    {
        System.out.println("Instance Block started");
        m1();
        System.out.println("Instance Block end");
    }
    static {
        System.out.println("Static Block -2");
    }

    public static void m1()
    {
        System.out.println("Inside m1 method");
    }
    public static void main(String[] args)
    {
        System.out.println("main method started");
        ExecutionFlow e  = new ExecutionFlow();
        System.out.println("main method end");


    }
}
