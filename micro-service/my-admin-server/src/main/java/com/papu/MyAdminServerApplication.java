package com.papu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MyAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAdminServerApplication.class, args);
	}

}