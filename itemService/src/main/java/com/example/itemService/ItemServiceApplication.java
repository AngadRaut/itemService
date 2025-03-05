package com.example.itemService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {
	public static final Logger log = LoggerFactory.getLogger(ItemServiceApplication.class);

	public static void main(String[] args) {
		log.info("\n\n\n\nApplication Started!!!\n\n\n\n");
		SpringApplication.run(ItemServiceApplication.class, args);
	}
}