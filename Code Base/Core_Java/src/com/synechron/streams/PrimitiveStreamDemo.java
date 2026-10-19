package com.synechron.streams;

import java.util.stream.IntStream;

public class PrimitiveStreamDemo {
public static void main(String[] args) {

int sum=	IntStream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15).filter(n->n%2==0).sum();
System.out.println("Sum of even nos is "+sum);
}
}
