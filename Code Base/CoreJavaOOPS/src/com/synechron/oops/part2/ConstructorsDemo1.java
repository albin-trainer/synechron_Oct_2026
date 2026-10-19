package com.synechron.oops.part2;
public class ConstructorsDemo1 {
public static void main(String[] args) {
    new Employee(); //Person constructor
    new Customer();//Person constructor  Customer constructor
}
}
class Person{
Person(){
    System.out.println("Person constructor");
}
}
class Employee extends Person{

}
class Customer extends Person{
    Customer(){
        System.out.println("Customer constructor");
    }
}
