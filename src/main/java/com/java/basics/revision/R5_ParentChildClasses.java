package com.java.basics.revision;

public class R5_ParentChildClasses {
    
    public static void main(String[] args)
    {
        Parent parent = new Parent();
        parent.m1();
//        parent.m2();  //Not possible
        
        Child child= new Child();
        child.m1();
        child.m2();
        
        Parent parent1= new Child();
        parent1.m1();
//        parent1.m2(); //Not possible

//        Child child1= new Parent(); //Not possible
        
    }
}


class Parent
        {
           public void m1()
           {
               System.out.println("Parent Method");
           }    
           
        }
class Child extends Parent
{
    public void m2()
    {
        System.out.println("Child Method");
    }

}
