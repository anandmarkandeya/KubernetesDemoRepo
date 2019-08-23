package com.kubernates.KubernetesDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class KubeDemoController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Hello Anand !!!!";
	}

}
