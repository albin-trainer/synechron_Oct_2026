package com.synechron.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo1 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("Lakshmi");
	names.add("Bhargavi");
	names.add("Pranitha");
	names.add("Amrutha");
	names.add("Srijan");
	names.add("Sunny sharma");
	names.add("Jalaj");
	System.out.println(names);
	Collections.sort(names);
	System.out.println(names);
	
	Product p1=new Product(101, "T Shirt", 1000, 4.5f);
	//System.out.println(p1);//toString() called internally
	//System.out.println(p1.toString());
	Product p2=new Product(102, "Sunsilk Shampoo", 5, 4.3f);

	Product p3=new Product(103, "Laptop", 50000, 4.1f);

	Product p4=new Product(104, "Iphone 17Pro", 150000, 3.5f);

	Product p5=new Product(105, "Shampoo conditionar", 100, 5f);
	ArrayList<Product> products=new ArrayList<>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	products.add(p5);
	System.out.println("****My products*****");
	for(Product p:products) {
		System.out.println(p);
	}
	Collections.sort(products);
	System.out.println("****After sorting*****");
	for(Product p:products) {
		System.out.println(p);
	}
}
}
