package com.wp.panditmandar.scdemo.addedinfo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookAddedInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAddedInfoServiceApplication.class, args);
	}

    @Bean
    ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
