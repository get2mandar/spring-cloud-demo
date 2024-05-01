package com.wp.panditmandar.scdemo.bookdata;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfig {

	@Bean
	GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("book-data-service").packagesToScan("com.wp.panditmandar.scdemo.bookdata")
				.build();
	}

	@Bean
	OpenAPI booksAPI() {
		return new OpenAPI()
				.info(new Info().title("Book Data APIs").description("Books Master Data Provider APIs").version("1.0"));
	}

}