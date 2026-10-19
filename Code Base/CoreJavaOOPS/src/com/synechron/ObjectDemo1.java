package com.synechron;

public class ObjectDemo1 {
    public static void main(String[] args) {
        int x=10;
     Customer c1= new Customer();
     c1.setCustId(101);
     c1.setCustomerName("Kevin");
     c1.setAddress("Brigade, Bangalore");
     System.out.println(c1.getCustomerName()+" is living in "+c1.getAddress());
     update(c1);
     System.out.println(c1.getCustomerName()+" is living in "+c1.getAddress);
     Customer c2=new Customer();
     c2.setCustId(102);
     c2.setCustomerName("Jalaj");
     c2.setAddress("Bangalore");
     System.out.println(c2.getCustomerName()+" living in "+c2.getAddress());
}
static  void update(Customer c){
    //c=new Customer();
    c.setAddress("Bangalore, Brigade");
}
}
