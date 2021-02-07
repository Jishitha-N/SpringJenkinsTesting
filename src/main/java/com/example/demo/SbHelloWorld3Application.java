package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbHelloWorld3Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SbHelloWorld3Application.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value= "name", defaultValue="WoRLd") String name) {
		return String.format("HEllo %s!", name);
	}
}
