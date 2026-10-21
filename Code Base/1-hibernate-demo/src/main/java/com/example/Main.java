package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	///configure mthod automatically reads hibernate.cfg.xml file
	/// it creates the neccessary tables based on the Entity classes
	static SessionFactory sesFact=new Configuration().
			configure().buildSessionFactory();
	
public static void main(String[] args) {
	System.out.println("Hello, tables are created ");
}
}
