package com.synechron.collections;

public class Product implements Comparable<Product> {
private int prodId;
private String prodName;
private float price;
private float ratings;
public Product(int prodId, String prodName, float price, float ratings) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
}

public int hashCode() {
	System.out.println("***Hashcode called ****");
	return prodId;
}
public boolean equals(Object obj) {
	System.out.println("***Equals called ****");
	Product p=(Product)obj;
	if(this.prodId==p.prodId && this.price==p.price && this.ratings==p.ratings && this.prodName.equals(p.prodName)) {
		return true;
	}
	return false;
}
public int getProdId() {
	return prodId;
}

public String getProdName() {
	return prodName;
}

public float getPrice() {
	return price;
}

public float getRatings() {
	return ratings;
}

public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", ratings=" + ratings + "]";
}
@Override
public int compareTo(Product p) {
	if(this.price<p.price)
		return -1;
	return 1;
}

/*
 * public String toString() { return "Hello"; }
 */

}

