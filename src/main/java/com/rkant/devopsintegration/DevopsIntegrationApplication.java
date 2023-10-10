package com.rkant.devopsintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication  {

	
	public static final Logger logger = LoggerFactory.getLogger(DevopsIntegrationApplication.class);
	
	@GetMapping("/")
	public String getMessage() { return "Welcome to rkant world!"; }
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
		
	}

}


