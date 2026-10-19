package com.synechron.lambdas;

public class LambdaDemo {
public static void main(String[] args) {
	Greeting g1=(String name)->{
		return "Hi "+ name+" Happy holidays ";
	};
	
	System.out.println(g1.wish("Fresh synechrons"));
	Greeting g2=n->  "Hi "+n+" Adv Happy Birthday!!!!";
	postWishes(g2, "Chandana");
	
}
static void postWishes(Greeting g,String n) {
	System.out.println(g.wish(n));
}
}
