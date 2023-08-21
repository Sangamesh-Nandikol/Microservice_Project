package com.nandi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface WelconeFeign {

	@GetMapping("/greet")
	public String invokeGreetApi();
	
}
