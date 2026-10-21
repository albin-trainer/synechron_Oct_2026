package com.synechron.exceptions;

public class NestedTry {
public static void main(String[] args) {
	try {
		int a=10;
		int nums[]= {1,2,3,4,5};
		System.out.println(a/nums[5]);
		System.out.println("outside try");
		try {
			System.out.println("inside try");
			System.out.println(nums[5]);
		}
		catch(ArithmeticException  e) {
			System.out.println("catch 1");
		}
		System.out.println("Try 1 ends");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("catch 2");
	}
	System.out.println("End of main");
}
}
