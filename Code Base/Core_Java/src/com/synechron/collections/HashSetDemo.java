package com.synechron.collections;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 1000, 4.5f);
	
	
	Product p2=new Product(102, "Sunsilk Shampoo", 5, 4.3f);

	Product p3=new Product(103, "Laptop", 50000, 4.1f);

	Product p4=new Product(104, "Iphone 17Pro", 150000, 3.5f);

	Product p5=new Product(105, "Shampoo conditionar", 100, 5f);
	
	Product p6=new Product(101, "T Shirt", 1000, 4.5f);
	//System.out.println(p1.hashCode());
	//System.out.println(p6.hashCode());
	//System.out.println(p1.equals(p6));
//	int n=5;
//	int r=(n - 1) & p1.hashCode();
//	System.out.println(r);
	HashSet<Product> set=new HashSet<>();
	set.add(p1);set.add(p2);set.add(p6); set.add(p3);set.add(p4);set.add(p5);
	System.out.println("No of elements : "+set.size());
}
}
