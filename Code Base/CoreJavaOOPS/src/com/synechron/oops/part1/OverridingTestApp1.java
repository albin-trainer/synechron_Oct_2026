package com.synechron.oops.part1;

public class OverridingTestApp1 {
public static void main(String[] args) {
    Parent p=new Child();
    p.f1();
    p.f2();
}
}
class Parent{
    public void f1(){
        System.out.println("Parent f1 non static method");
    }
    public static void f2(){
        System.out.println("Parent f2  Staticmethod ");
    }
}
class Child extends  Parent{
     public void f1(){
        System.out.println("Child f1 non static method");
    }
    public static void f2(){
        System.out.println("Child  f2  Staticmethod ");
    }
}