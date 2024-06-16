package com.spring.social_media_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  //extra
public class SocialMediaApplication {

	//@CrossOrigin(origins = "http://localhost:8080")  //extra

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaApplication.class, args);
	}

	//extra
	@GetMapping("/")
	public String rootEndpoint() {
		return "Hello World!";
	}
}
