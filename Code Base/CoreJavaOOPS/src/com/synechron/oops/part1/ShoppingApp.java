package com.synechron.oops.part1;

public class ShoppingApp {
public static void main(String[] args) {
    Laptop laptop=new Laptop();
    laptop.setProductCode(101);
    laptop.setProductName("DELL");
    laptop.setPrice(70000);
    laptop.setRamMemory("16 GB");
    laptop.setOs("Windows 11");

    Book book=new Book();
    book.setProductCode(102);
    book.setProductName("Harry Porter");
    book.setPrice(500);
    book.setAuthour("JK Rowlin");
    book.setGenre("Fiction");

    int arr[]={1,2,3,4,5};
    Product myCart[]={laptop,book};
   /* for(int i=0;i<myCart.length;i++){
        myCart[i].display();
        System.out.println("***********");
    }*/
   for (Product p:myCart){ //for each loop
     p.display();
     System.out.println("***********");

   }
   //Product p=new Product();
}
}
