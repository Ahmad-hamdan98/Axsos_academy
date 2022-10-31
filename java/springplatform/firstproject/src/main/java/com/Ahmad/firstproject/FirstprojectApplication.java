package com.Ahmad.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class FirstprojectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String ind() {
		return "to day uoe will find love ";
	}
	@RequestMapping("/tomorrow")
	public String inde() {
		return "tomorrow ,an opportunity will arise , so be sure to be open to new ideas";
	}

}
