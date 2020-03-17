package com.vr.decabilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DecabiitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecabiitiesApplication.class, args);
	}

	@RestController
	class MainController{

		@GetMapping("/")
		public String get(){
			return "Welcome, Decabilities version 0.0.1";
		}
	}

}
