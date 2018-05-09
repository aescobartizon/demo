package com.indra.ar.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	private static final String DEMO_END_POINT = "/demo";
	
	@GetMapping(path = DEMO_END_POINT)
	public String getDemo() {
			
		return "Hello World";

	}
}
