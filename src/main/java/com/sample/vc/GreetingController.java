package com.sample.vc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

	@GetMapping
	public String greet() {
		return "Hey Cheers to the Good day!";
	}
}
