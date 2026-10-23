package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.bean.AccRepoImpl;
import com.example.bean.AccServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.example")
public class SpringConfig {
	@Bean("service") //<bean> in xml replaced by this annotation
	 public AccServiceImpl getAccService() {
		 return new AccServiceImpl();
	 }
	
	/*@Bean
	public AccRepoImpl getAccRepo() {
		return new AccRepoImpl();
	}*/
}
