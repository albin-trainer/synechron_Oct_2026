package com.synechron;

public class HelloWorld {
public static void main(String[] args) {
    System.out.println("Hello");

    byte x=127; //-128 to 127 will get compilation error if out of range
    System.out.println(x);
    final int a=10;//a is constant
    byte y=a; ///ERROR if a is not final   !!!!
    System.out.println(y);
    final int b=128;
    byte z=(byte)b;//type casting or type conversion otherwise error
    System.out.println(z);

    float price=100;
    System.out.println(price);//100.0
    float fare=100.0f;
    System.out.println(fare);
    boolean status=true;
    char ch='A';
    
}

}
