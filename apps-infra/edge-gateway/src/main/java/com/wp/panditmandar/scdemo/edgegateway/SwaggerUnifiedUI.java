package com.wp.panditmandar.scdemo.edgegateway;

import java.util.Objects;

import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerUnifiedUI {

	@Bean
	CommandLineRunner openApiGroups(RouteDefinitionLocator locator,
			SwaggerUiConfigParameters swaggerUiConfigParameters) {
		return args -> Objects.requireNonNull(locator.getRouteDefinitions().collectList().block()).stream()
				.map(RouteDefinition::getId).forEach(swaggerUiConfigParameters::addGroup);
	}
}