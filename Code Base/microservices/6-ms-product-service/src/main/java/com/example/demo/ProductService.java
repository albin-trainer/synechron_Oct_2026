package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
@Service 
public class ProductService {
	@Autowired
 private Environment env;
	
 public List<Product> allProducts(){
	 String port=env.getProperty("local.server.port");
	 List<Product> list=new ArrayList<>();
	 list.add(new Product(1, "Speaker", 1000, port));
	 list.add(new Product(2, "Shoes", 2000, port));
	 list.add(new Product(3, "Bag", 1200, port));
	 list.add(new Product(4, "Shirt", 2500, port));
	 list.add(new Product(5, "Watch", 5000, port));
	 return list;
 }
	
}
