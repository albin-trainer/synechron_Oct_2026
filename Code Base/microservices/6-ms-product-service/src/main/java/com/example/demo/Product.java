package com.example.demo;

public class Product {
private int productId;
private String prodName;
private float price;
private String port;
public Product() {
}

public Product(int productId, String prodName, float price, String port) {
	super();
	this.productId = productId;
	this.prodName = prodName;
	this.price = price;
	this.port = port;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getPort() {
	return port;
}
public void setPort(String port) {
	this.port = port;
}

}
