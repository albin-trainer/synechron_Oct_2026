package com.synechron.oops.part3;
public class TypecastingDemo1 {
public static void main(String[] args) {
    drive(new Car());
   drive(new Bicycle());
    }
static  void drive(Vehicle v){
   v.drive();
   if(v instanceof Car) {
	   Car car=(Car)v;
	   car.steer();
   }
}
}
class Vehicle{
    void drive(){System.out.println("driving a vehicle");}
}
class Car extends  Vehicle{
void steer() {
	System.out.println("Steering my car ...");
}
}
class Bicycle extends  Vehicle{
}