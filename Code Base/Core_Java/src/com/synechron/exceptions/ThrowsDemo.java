package com.synechron.exceptions;

public class ThrowsDemo {
public static void main(String[] args) {
	yourMethod();
}

static void yourMethod() {
	try { //must write try and catch here .....
		myMethod(); 
	} catch (Exception e) {
		e.printStackTrace();
	}
}

static void myMethod()  throws Exception {
	
}
}
