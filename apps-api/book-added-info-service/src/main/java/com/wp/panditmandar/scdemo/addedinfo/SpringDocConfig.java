package com.wp.panditmandar.scdemo.addedinfo;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfig {

	@Bean
	GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("book-added-info-service")
				.packagesToScan("com.wp.panditmandar.scdemo.addedinfo").build();
	}

	@Bean
	OpenAPI booksAPI() {
		return new OpenAPI().info(new Info().title("Books Added Info APIs")
				.description("Books Additional Information Provider APIs").version("1.0"));
	}

}