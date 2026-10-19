package com.synechron.collections;

import java.util.Vector;

public class ListEx1 {
public static void main(String[] args) {
	//Vector provides Dynamic Array
	//creates a array of capacity 10
	Vector<String> v1=new Vector<>();
	System.out.println(v1.capacity());
	
	Vector<String> v2=new Vector<>(3);
	System.out.println(v2.capacity());
	v2.add("Bangalore");
	v2.add("Mysore");
	System.out.println("no of elements is "+v2.size());
	System.out.println(v2);
	v2.add("Delhi");
	v2.add("Mumbai"); //@runtime creates another array,doubles the capacity of original
	System.out.println(v2);
	System.out.println(v2.capacity());
}
}
