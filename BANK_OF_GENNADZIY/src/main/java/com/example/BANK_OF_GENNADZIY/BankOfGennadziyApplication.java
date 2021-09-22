package com.example.BANK_OF_GENNADZIY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BankOfGennadziyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOfGennadziyApplication.class, args);
	}

}
