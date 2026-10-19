package com.synechron.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
public static void main(String[] args) {

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
	Collections.sort(products); //sorted by price L to H (Natural order)
	//Collections.sort(products, new SortByRating());
	 Comparator<Product> compare=(Product pr1, Product pr2)  -> {
			return pr1.getRatings()<pr2.getRatings()?1:-1;
		};
	 
	Collections.sort(products, compare);
	
	 Comparator<Product> compare2=( pr1,  pr2)  ->  pr1.getRatings()<pr2.getRatings()?1:-1;
		;
	 Collections.sort(products,compare2);
	 System.out.println("*************");
	 Collections.sort(products,( pr1,  pr2)  ->  pr1.getRatings()<pr2.getRatings()?1:-1);
	for(Product p : products) {
		System.out.println(p);
	}
}
}

class SortByRating implements Comparator<Product>{
	public int compare(Product p1, Product p2) {
		return p1.getRatings()<p2.getRatings()?1:-1;
	}
	
}
