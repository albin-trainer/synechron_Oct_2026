package com.synechron.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
public static void main(String[] args) {
	//cannot guaranty the order
	HashSet<String> set1=new HashSet<>();
	set1.add("Orange");
	set1.add("Guava");
	set1.add("Banana");
	set1.add("Apple");
	set1.add("Orange"); //wont add
	set1.add("Mango");
	System.out.println(set1);
	
	//sorted by default
	TreeSet<String> set2=new TreeSet<>();
	set2.add("Orange");
	set2.add("Guava");
	set2.add("Banana");
	set2.add("Apple");
	set2.add("Orange"); //wont add
	set2.add("Mango");
	System.out.println(set2);
	//insertion order....
	LinkedHashSet<String> set3=new LinkedHashSet<>();
	set3.add("Orange");
	set3.add("Guava");
	set3.add("Banana");
	set3.add("Apple");
	set3.add("Orange"); //wont add
	set3.add("Mango");
	System.out.println(set3);
	
}
}
