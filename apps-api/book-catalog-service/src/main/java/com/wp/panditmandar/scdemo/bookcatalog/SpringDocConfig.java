package com.wp.panditmandar.scdemo.bookcatalog;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfig {

	@Bean
	GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("book-catalog-service")
				.packagesToScan("com.wp.panditmandar.scdemo.bookcatalog").build();
	}

	@Bean
	OpenAPI booksAPI() {
		return new OpenAPI().info(new Info().title("Books Catalog APIs")
				.description("Books Catalog Search and Filter APIs").version("1.0"));
	}

}