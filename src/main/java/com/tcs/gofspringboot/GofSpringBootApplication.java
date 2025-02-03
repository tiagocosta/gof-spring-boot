package com.tcs.gofspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GofSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GofSpringBootApplication.class, args);
	}

}
