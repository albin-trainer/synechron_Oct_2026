package com.example.demo;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductApi {
	@Autowired
	private ProductService productService;
	@GetMapping("/{id}")
  public Product searchById(@PathVariable("id") int id) {
		 List<Product> products=productService.allProducts();
		 Predicate<Product> predicate=  p->p.getProductId()==id;
		Product p= products.stream().filter(predicate).findFirst().get();
	  return p;
  }
}
