package com.bookMyCar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApplicationController {
	
	@GetMapping("getDetails")
	public String getDetails() {
		return "returning car details";
	}
	
}
