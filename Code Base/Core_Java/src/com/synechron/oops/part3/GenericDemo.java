package com.synechron.oops.part3;

public class GenericDemo {
public static void main(String[] args) {
	MyData<String> obj1=new MyData<>();
	obj1.setE("Bangalore");
	
	MyData<Integer> obj2=new MyData<>();
	obj2.setE(99);
	
	String s=obj1.getE();//no need of typecasting
	int x=obj2.getE();//auto unboxing
	System.out.println(s);
	System.out.println(x);
}
}

class MyData<E>{
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
}
