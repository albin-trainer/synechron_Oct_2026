package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.GreetingBean;

public class Main {
	public static void main(String[] args) {
		//1. initialize the spring container
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Spring container started/initialized");
		GreetingBean bean=(GreetingBean) ctx.getBean("mybean");
		System.out.println(bean.sayHello("Albin"));
		GreetingBean bean2=(GreetingBean) ctx.getBean("mybean");
		System.out.println(bean==bean2);
	}
}
