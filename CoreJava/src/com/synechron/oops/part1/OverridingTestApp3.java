package com.synechron.oops.part1;

public class OverridingTestApp3 {
    public static void main(String[] args) {
        Base b=new Derive();
        System.out.println(b.x);
    }
}

class Base{
    int x=getVal();
    int y=5;

    int getVal(){
        return y+5;
    }

}
class Derive extends  Base{
 int getVal(){
        return y*5;
    }
}