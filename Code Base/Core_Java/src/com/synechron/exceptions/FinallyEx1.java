package com.synechron.exceptions;

public class FinallyEx1 {
public static void main(String[] args) {
	System.out.println("Welcome");
	try {
		int a=10;
		if(a>=10) {
			System.out.println("Bye");
			return; //back to the caller, but             executes finally 1st and go back to caller
		}
	}
	finally {
		System.out.println("In finally");
	}
	System.out.println("End of main");
}
}
