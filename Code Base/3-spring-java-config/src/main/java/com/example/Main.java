package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.AccServiceImpl;
import com.example.bean.AccountService;
import com.example.config.SpringConfig;

public class Main {
	public static void main(String[] args) {
		//1. initialize the spring container
		//ApplicationContext ctx=
		//		new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx= 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("***********************");
		AccountService service=
				(AccountService) ctx.getBean("service");
		System.out.println(service.credit(1000));
	}
}
