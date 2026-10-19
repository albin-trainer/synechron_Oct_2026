package com.synechron.oops.part1;

public class OverridingTestApp2 {
public static void main(String[] args) {
    Parent1 p=new Child1();
    p.helloParent();
}
}

class Parent1{
   void  helloParent(){
    String s=hello();
    System.out.println(s);
    }
    private String hello(){
        return "I m coming from Parent";
    }
}
class Child1 extends  Parent1{
String hello(){
        return "I m coming from Child";
    }
}
