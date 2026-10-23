package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
	@GetMapping(value="/hello",produces = "text/html")
	public String hello() {
		return "<font color=purple size=15> Happy Birthday Chandana</font>";
	}
}
