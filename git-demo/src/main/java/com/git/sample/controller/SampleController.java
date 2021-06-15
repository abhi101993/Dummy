package com.git.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SampleController {

@GetMapping("/hello")
public String getMessage()
{
	return "Hello";
}


@PostMapping("/hello")
public String getMess()
{
	return "Hi";
}
	
	
}
