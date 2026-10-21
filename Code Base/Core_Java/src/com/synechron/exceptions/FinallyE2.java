package com.synechron.exceptions;

public class FinallyE2 {
public static void main(String[] args) {
	System.out.println(getVal());
}
static int getVal() {
	try {
		System.out.println("in try");
		System.out.println(5/0);
		return 1;
	}
	catch(Exception e) {
		System.out.println("catch");
		return 2; //return 2 is proccessed not it wont return
		//immedieatly until finally invoked....
	}
	finally {
		System.out.println("finally");
		return 3;
	}
}
}
