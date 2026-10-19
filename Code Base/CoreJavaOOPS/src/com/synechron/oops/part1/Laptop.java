package com.synechron.oops.part1;

public class Laptop extends  Product{
private String ramMemory;
private String os;
//create only setters
public void setRamMemory(String ramMemory) {
    this.ramMemory = ramMemory;
}
public void setOs(String os) {
    this.os = os;
}
void display(){
    super.display();
    System.out.println("Ram memory is "+ramMemory);
    System.out.println("OS is "+os);
}

}
