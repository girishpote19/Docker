package com.dockerProj.SimpleAppForPrac.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Dockerized Spring Boot app!";
	}
}
