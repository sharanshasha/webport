package com.webport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebportController {
	@GetMapping(path="/webpo")
	public String hai() {
		return "HelloWorld";
	}
	

}
