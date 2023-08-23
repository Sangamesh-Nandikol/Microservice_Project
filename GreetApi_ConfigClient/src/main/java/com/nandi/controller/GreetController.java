package com.nandi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/grt")
	public String greetMsg() {
		return msg;
	}
}
