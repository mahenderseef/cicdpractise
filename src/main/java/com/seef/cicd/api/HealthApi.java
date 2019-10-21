package com.seef.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthApi {

	@GetMapping("/health")
	public String hello() {
		return "Hello, Api";
	} 

}
