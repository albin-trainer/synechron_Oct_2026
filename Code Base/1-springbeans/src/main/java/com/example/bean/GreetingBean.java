package com.example.bean;

public class GreetingBean {
private String msg;
public GreetingBean() {
System.out.println("Constructor of GreetingBean");
}

public void setMsg(String msg) {
	System.out.println("setter called");
	this.msg=msg;
}

public String sayHello(String name) {
	return "Hi "+name+" "+msg;
}

}
