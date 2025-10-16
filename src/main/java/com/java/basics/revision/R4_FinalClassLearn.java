package com.java.basics.revision;

public class R4_FinalClassLearn {

   public static void main(String[] args)
   {
       A a =  new A();
       a.m1();
       a.x=a.x+10;
   }
}


final class A{

    public static int x=10;
    public  void m1()
    {
        System.out.println("this method from Final class");
    }
}

//class B  extends A
//{
//    // we will get compile time as error as A class is final
//}
