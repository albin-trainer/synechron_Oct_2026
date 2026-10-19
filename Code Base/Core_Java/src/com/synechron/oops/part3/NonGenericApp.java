package com.synechron.oops.part3;

public class NonGenericApp {
public static void main(String[] args) {
	Data data1=new Data();
	data1.setObj("Bangalore");
	
	Data data2=new Data();
	data2.setObj(99);
	
	String city= (String) data1.getObj();
	System.out.println(city);
	//auto unboxing
	int x= (Integer) data1.getObj(); //exceptipn
	
	System.out.println(x);
}
}
class Data{
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}