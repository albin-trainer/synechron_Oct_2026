package com.synechron.exceptions;

public class ExceptionEx1 {
public static void main(String[] args) {
	System.out.println("Hello welcome");
	try {
		int nums[]= {1,2,3,4,5};
		System.out.println(nums[4]);//stops here
	int a=10;
	int b=5;
	int c=a/((b*2)-a);
	System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println("Catch 1");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Catch 2");
	}
	System.out.println("End of main ....");
}
}
