package com.synechron.lambdas;

public class LambdaDemo2 {
public static void main(String[] args) {
	Calculator c1=(x,y)->x+y;
	doCal(c1, 99, 99);
	System.out.println("*****");
	doCal( (a,b)->a*b , 10, 10);
}

static void doCal(Calculator c, float a, float b) {
	System.out.println(c.eval(a, b));
}
}
