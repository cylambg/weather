package com.test.currencyfair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
@EnableScheduling
public class CurrencyfairApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyfairApplication.class, args);
	}

}
