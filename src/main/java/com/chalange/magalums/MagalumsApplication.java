package com.chalange.magalums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MagalumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagalumsApplication.class, args);
	}

}
