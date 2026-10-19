package com.synechron.oops.part3;
public class InterfacesDemo1 {
public static void main(String[] args) {
	Drive driver=getCar("BMW");
	driver.steering();
}
static Drive getCar(String car) {
	if(car.equals("BMW")) return new BMW();
	else return new Swift();
}
}
interface Drive{
	int MAX_SPEED=200;  //public static final MAX_SPEED=200
	void steering(); //public abstract void steering()
}
class BMW implements Drive{
	public void steering() {
		System.out.println("BWM steering program started working .....");
	}
}

class Swift implements Drive{
	public void steering() {
		System.out.println("Swift steering program started working .....");
	}
}