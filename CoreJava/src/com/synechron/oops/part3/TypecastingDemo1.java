package com.synechron.oops.part3;
public class TypecastingDemo1 {
public static void main(String[] args) {
    drive(new Car());
}
static  void drive(Vehicle v){
v.drive();
}
}
class Vehicle{
    void drive(){System.out.println("driving a vehicle");}
}
class Car extends  Vehicle{

}
class Bicycle extends  Vehicle{

}