package com.synechron.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo1 {
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
	
	products.stream().
	filter(   (Product p)->p.getRatings()>=4  ).
	forEach(p->System.out.println(p));
	//find the costliest product
	Product costliestProduct=products.
			stream().
			max((pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1).
			get();
	System.out.println("Costliest product is "+costliestProduct.getProdName());
//	find the cheapest product
//	find the highly rated product
//	find the low rated product
//	using streams display the products by ratings H to L
//	find top 3 rated products
	products.
	stream().
	sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?-1:1).limit(3).forEach(p->System.out.println(p));
	
	System.out.println("****************");
	List<String> prodNames=sortByRatings(products);
	System.out.println(prodNames);
	System.out.println("total price of all products "+findTotalPrice(products));
	
	Product p=searchById(products, 99);
	if(p!=null) {
		System.out.println("Product found "+ p.getProdName());
	}
	else {
		System.out.println("Not Found !!!!");
	}
	
}

static Product searchById(List<Product> products ,int productId) {
		//if product found return the product 
	    //else return null
	                 //here findFirst() throws exception if no element found
	//products.stream().filter(p->p.getProdId()==productId).findFirst().get();
	Optional<Product> optional=
			products.stream().filter(p->p.getProdId()==productId).findFirst();
	  if(optional.isPresent())
		   return optional.get();
	return null;
}


static double findTotalPrice(List<Product> products) {
	return products.stream().mapToDouble(p->p.getPrice()).sum();
}
 //returns only product names 
 static List<String> sortByRatings(List<Product> products){
	 List<String> productNames=
	       products.stream().
	       sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?1:-1)
	       .map((p)->p.getProdName()).toList();
	       
	 return productNames;
 }
}
