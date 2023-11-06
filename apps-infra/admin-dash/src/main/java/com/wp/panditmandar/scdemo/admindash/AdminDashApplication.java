package com.wp.panditmandar.scdemo.admindash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AdminDashApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminDashApplication.class, args);
	}

}
