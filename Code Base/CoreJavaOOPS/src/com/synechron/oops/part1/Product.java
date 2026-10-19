package com.synechron.oops.part1;
public abstract class Product {
    private int productCode;
    private String productName;
    private float price;
    //create only setters
     void display(){
        System.out.println("prodId is "+productCode);
        System.out.println("Prod name is "+productName);
        System.out.println("price is "+price);
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
}
