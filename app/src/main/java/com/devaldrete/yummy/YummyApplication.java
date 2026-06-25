package com.devaldrete.yummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class YummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YummyApplication.class, args);
	}

	@GetMapping("/health")
	public Record health() {
		
	}

}
