package com.maqcoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class FirstController {

	@GetMapping("/maqcoding")
	public String helo() {
		return "helo maqcoding ";
	}
	
}
