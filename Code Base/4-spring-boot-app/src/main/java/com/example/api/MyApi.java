package com.example.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //signifies its a REST API
public class MyApi {
	@GetMapping(value="/hello",produces = "text/html")
	public String hello() {
		return "<font color=purple size=15>HAppy Diwali</font>";
	}
}
