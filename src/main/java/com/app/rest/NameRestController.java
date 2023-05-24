package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "<h1>Welcome to Aws</h1>";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcomeMsgWithName(@PathVariable  String name) {
		return "<h2>Welcome to Aws</h2>"+ name;
	}
	

}
