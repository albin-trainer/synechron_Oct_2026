package com.synechron.exceptions;

import java.util.Scanner;

public class ThrowDemo1 {
public static void main(String[] args) {
	System.out.println("*****Welcome to HDFC Bank ATM******");
	//to take input from user
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the anount to Withdraw");
	int amt=scanner.nextInt();
	
	if(amt >20000 || amt<100 || amt%100!=0) {
	// throw new ArithmeticException();
	throw new InvalidInputException("Pls enter valid amt");
	}
	else {
		System.out.println("Transaction done, thank for using hdfc atm");
	}
}
}
