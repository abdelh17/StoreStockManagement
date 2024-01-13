package com.abdel.stockmanagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication
@SpringBootApplication
@EnableJpaAuditing
public class StockmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockmanagementApplication.class, args);
	}


}
