package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//initialize spring container (Application Context)
		//scans the classpath and create instance of neccessary beans
		//in the classpath tomcat lib is present, so it startsn tomcat too
		//and return ApplicationContext
		SpringApplication.run(Application.class, args);
	}

}
