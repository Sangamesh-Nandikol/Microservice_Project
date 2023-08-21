package com.nandi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nandi.feign.WelconeFeign;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelconeFeign feign;
	
	@GetMapping("/welcome")
	public String welcome() {
		
		//using RestTemplate 
//		RestTemplate rt=new RestTemplate();
//		ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet", String.class);
//		String body = forEntity.getBody();		
//		return body+"welcome to my world";
		
		//using fegin client
		
		String invokeGreetApi = feign.invokeGreetApi();
		
		return invokeGreetApi+" Welcome to my world";
	}

}
