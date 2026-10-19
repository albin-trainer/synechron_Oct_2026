package com.synechron.oops.part1;

public class OverridingTestApp4 {
public static void main(String[] args) {
    Base1 base=new Derive1();
    base.print();
    System.out.println(base.a);
}
}
class Base1{
    int a=10;
    void print(){
        System.out.println(a);
    }
}

class Derive1 extends  Base1{
     int a=99;
    void print(){
        System.out.println(a);
    }
}