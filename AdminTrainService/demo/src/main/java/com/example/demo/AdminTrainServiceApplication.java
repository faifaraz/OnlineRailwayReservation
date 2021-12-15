package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class AdminTrainServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdminTrainServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
	}

}
